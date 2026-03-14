package com.watchcow.injector.Services;


import com.watchcow.injector.DTOs.ServerMetrics;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

@Service
public class InjectorService {


    private final KafkaTemplate<String,String> kafkaTemplate ;
    private final ObjectMapper mapper  = new ObjectMapper() ;

    public InjectorService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;

    }

    public void publishServerMetrics(ServerMetrics metrics){


        String key = metrics.getAgentInfo().getAgentId();

        String metricsData = mapper.writeValueAsString(metrics);

        kafkaTemplate.send("watchcow-metrics" , key , metricsData)
                .whenComplete((result,ex) ->{
                        if(ex == null){
                            System.out.println("Sent Succesfully");
                        }
                        else {
                        System.out.println("Kafka Sent Failed");
                        ex.printStackTrace();
                        }
                        }

                        );

    }

}
