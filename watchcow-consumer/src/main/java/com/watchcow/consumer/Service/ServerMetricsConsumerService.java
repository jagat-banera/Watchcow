package com.watchcow.consumer.Service;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.watchcow.consumer.DTOs.ServerMetrics;
import com.watchcow.consumer.Repository.ServerMetricsRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ServerMetricsConsumerService {

    private final ObjectMapper mapper = new ObjectMapper();
    private final StoreMetricsService metricsService ;


    public ServerMetricsConsumerService( StoreMetricsService metricsService) {
        this.metricsService = metricsService;

    }

    @KafkaListener(topics = "watchcow-metrics" ,groupId = "watchcow-consumer-groupv2",  containerFactory = "kafkaListenerContainerFactory")
    public void ConsumeMetrics(String message){

        // All DB Commit logic has been shifted to StoreMetricsService class

        try {

            // Convert Kafka String to DTO
            ServerMetrics metrics = mapper.readValue(message , ServerMetrics.class);

            // Call the service to Commit to DB
            metricsService.commitToDB(metrics);

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
