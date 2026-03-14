package com.watchcow.consumer.Service;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.watchcow.consumer.DTOs.ServerMetrics;
import com.watchcow.consumer.Entities.ServerMetricsEntity;
import com.watchcow.consumer.Repository.ServerMetricsRepository;
import com.watchcow.consumer.Utils.DtoToEntityServerMetrics;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ServerMetricsConsumerService {

    private final ObjectMapper mapper = new ObjectMapper();
    private final ServerMetricsRepository repository ;

    public ServerMetricsConsumerService(ServerMetricsRepository repository) {
        this.repository = repository;
    }

    @KafkaListener(topics = "watchcow-metrics" ,groupId = "watchcow-consumer-groupv2",  containerFactory = "kafkaListenerContainerFactory")
    public void ConsumeMetrics(String message){

        try {

            // Convert the String to DTO object
            ServerMetrics metrics = mapper.readValue(message , ServerMetrics.class);
            System.out.println(metrics);

            // Convert DTO Object to Entity

            DtoToEntityServerMetrics dtoToEntityServerMetrics = new DtoToEntityServerMetrics(metrics);
            ServerMetricsEntity entity = dtoToEntityServerMetrics.convert();


            // Save the entity
            repository.save(entity);


        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
