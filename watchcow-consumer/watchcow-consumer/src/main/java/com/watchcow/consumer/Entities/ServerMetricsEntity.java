package com.watchcow.consumer.Entities;

import com.watchcow.consumer.DTOs.ServerMetrics;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;


@Entity
@Table(name = "server_metrics")
public class ServerMetricsEntity {

    // ID
    @EmbeddedId
    private ServerMetricsId serverMetricsId ;
    // Agent Details

    private String hostname ;
    private String version ;

    // CPU Load
    private double cpuLoad ;

    // Disk
    private  double totalDiskSpace;
    private  double freeDiskSpace;
    private  double usedDiskSpace;

    // Memoey
    private double totalMemory;
    private double freeMemory ;
    private double usedMemory ;

    // Load Average
    private double loadAverage  ;

    public ServerMetricsEntity() {
    }

    public ServerMetricsEntity(ServerMetricsId serverMetricsId , String hostname, String version, double cpuLoad, double totalDiskSpace, double freeDiskSpace, double usedDiskSpace, double totalMemory, double freeMemory, double usedMemory, double loadAverage) {

        this.serverMetricsId = serverMetricsId;
        this.hostname = hostname;
        this.version = version;
        this.cpuLoad = cpuLoad;
        this.totalDiskSpace = totalDiskSpace;
        this.freeDiskSpace = freeDiskSpace;
        this.usedDiskSpace = usedDiskSpace;
        this.totalMemory = totalMemory;
        this.freeMemory = freeMemory;
        this.usedMemory = usedMemory;
        this.loadAverage = loadAverage;


    }
}
