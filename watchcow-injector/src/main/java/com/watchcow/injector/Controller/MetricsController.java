package com.watchcow.injector.Controller;

import com.watchcow.injector.DTOs.ServerMetrics;
import com.watchcow.injector.Services.InjectorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metrics")
public class MetricsController {

    private final InjectorService injectorService;

    public MetricsController(InjectorService injectorService) {
        this.injectorService = injectorService;
    }

    @PostMapping("/server")
    public String systemMetrics(@RequestBody ServerMetrics serverMetrics) {


        // Push the Data to Kafka
        injectorService.publishServerMetrics(serverMetrics);


        // Return a resposne that the data received sucesfully
        return "Metrics Received" ;
    }

    @GetMapping("/server-test")
    public String Test(){
        return "Controller Fine";
    }

}
