package com.watchcow.consumer.Utils;

import com.watchcow.consumer.DTOs.ServerMetrics;
import com.watchcow.consumer.Entities.CollectionEvent;
import com.watchcow.consumer.Entities.ServerMetricsEntity;


import java.time.Instant;

public class DtoToEntityServerMetrics {



    public DtoToEntityServerMetrics() {

    }

    public ServerMetricsEntity convert(CollectionEvent event , ServerMetrics serverMetrics) {
        return new ServerMetricsEntity(
                event,
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
