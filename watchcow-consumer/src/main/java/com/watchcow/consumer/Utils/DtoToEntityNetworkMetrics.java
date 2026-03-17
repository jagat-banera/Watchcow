package com.watchcow.consumer.Utils;

import com.watchcow.consumer.DTOs.NetworkMetrcis;
import com.watchcow.consumer.DTOs.ServerMetrics;
import com.watchcow.consumer.Entities.CollectionEvent;
import com.watchcow.consumer.Entities.NetworkMetricsEntity;
import com.watchcow.consumer.Entities.ServerMetricsEntity;


import java.time.Instant;
import java.util.List;

public class DtoToEntityNetworkMetrics {

    private ServerMetrics serverMetrics ;


    public DtoToEntityNetworkMetrics() {
    }

    public List<NetworkMetricsEntity> convert(CollectionEvent event , ServerMetrics serverMetrics){

        return  serverMetrics.getNetworkMetrcis().getIntefaceData().stream()
                .map(
                        e ->
                                new NetworkMetricsEntity(
                                        event,
                                        serverMetrics.getAgentInfo().getHostname(),
                                        serverMetrics.getAgentInfo().getVersion(),
                                        e.intefaceName(),
                                        e.receivedBytes(),
                                        e.transferBytes()
                                )
                ).toList();




    }


}
