package com.watchcow.consumer.Utils;

import com.watchcow.consumer.DTOs.ServerMetrics;
import com.watchcow.consumer.Entities.ServerMetricsEntity;
import com.watchcow.consumer.Entities.ServerMetricsId;

import java.time.Instant;

public class DtoToEntityServerMetrics {

    private ServerMetrics serverMetrics ;

    public DtoToEntityServerMetrics(ServerMetrics serverMetrics) {
        this.serverMetrics = serverMetrics;
    }

    public ServerMetricsEntity convert(){
        return new ServerMetricsEntity(
                new ServerMetricsId(serverMetrics.getAgentInfo().getAgentId() , Instant.ofEpochMilli(serverMetrics.getCollectionTime())),
                serverMetrics.getAgentInfo().getHostname(),
                serverMetrics.getAgentInfo().getVersion(),
                serverMetrics.getCpu().getCpuLoad(),
                serverMetrics.getDisk().getTotalDiskSpace(),
                serverMetrics.getDisk().getFreeDiskSpace(),
                serverMetrics.getDisk().getUsedDiskSpace(),
                serverMetrics.getMemory().getTotalMemory(),
                serverMetrics.getMemory().getFreeMemory(),
                serverMetrics.getMemory().getUsedMemory(),
                serverMetrics.getLoadAverage().getLoadAverage()

        );
    }
}
