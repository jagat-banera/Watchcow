package com.watchcow.consumer.Service;


import com.watchcow.consumer.DTOs.ServerMetrics;
import com.watchcow.consumer.Entities.CollectionEvent;
import com.watchcow.consumer.Entities.NetworkMetricsEntity;
import com.watchcow.consumer.Entities.ServerMetricsEntity;
import com.watchcow.consumer.Repository.CollectionEventRepository;
import com.watchcow.consumer.Repository.NetworkMetricsRepository;
import com.watchcow.consumer.Repository.ServerMetricsRepository;
import com.watchcow.consumer.Utils.DtoToEntityNetworkMetrics;
import com.watchcow.consumer.Utils.DtoToEntityServerMetrics;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class StoreMetricsService {


    // Repositories of all 3 Tables
    private final NetworkMetricsRepository networkMetricsRepository ;
    private final ServerMetricsRepository serverMetricsRepository ;
    private final CollectionEventRepository collectionEventRepository ;

    // Utils to convert DTOS to Entity Object
    private final DtoToEntityServerMetrics convertServerMetrics ;
    private final DtoToEntityNetworkMetrics convertNetworkMetrics;


    public StoreMetricsService(NetworkMetricsRepository networkMetricsRepository, ServerMetricsRepository serverMetricsRepository, CollectionEventRepository collectionEventRepository, DtoToEntityServerMetrics convertServerMetrics, DtoToEntityNetworkMetrics convertNetworkMetrics) {
        this.networkMetricsRepository = networkMetricsRepository;
        this.serverMetricsRepository = serverMetricsRepository;
        this.collectionEventRepository = collectionEventRepository;
        this.convertServerMetrics = convertServerMetrics;
        this.convertNetworkMetrics = convertNetworkMetrics;
    }

    public void commitToDB(ServerMetrics metrics){

        // Use Convert service to get the object
        // We need t0 create a new colection event

        CollectionEvent event = new CollectionEvent(
                metrics.getAgentInfo().getAgentId(),
                Instant.ofEpochMilli(metrics.getCollectionTime())
        );

        // Create a NetworkEntityList
        List<NetworkMetricsEntity> networkMetricsEntities = convertNetworkMetrics.convert(event,metrics);

        // Create Server Entity Set
        ServerMetricsEntity serverMetricsEntity = convertServerMetrics.convert(event,metrics);



        // Commit to DB ( collection event Table )
        collectionEventRepository.save(event);

        // Save the Server Entity Record
        serverMetricsRepository.save(serverMetricsEntity);

        // Save to Network Metrcis
        networkMetricsRepository.saveAll(networkMetricsEntities);

    }

}
