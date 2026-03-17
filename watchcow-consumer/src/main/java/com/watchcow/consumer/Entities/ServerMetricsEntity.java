package com.watchcow.consumer.Entities;

import com.watchcow.consumer.DTOs.ServerMetrics;
import jakarta.persistence.*;

import java.time.Instant;


@Entity
@Table(name = "server_metrics")
public class ServerMetricsEntity {

    // ID
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinTable(name = "event_id")
    private CollectionEvent event;

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

    public ServerMetricsEntity(CollectionEvent event, String hostname, String version, double cpuLoad, double totalDiskSpace, double freeDiskSpace, double usedDiskSpace, double totalMemory, double freeMemory, double usedMemory, double loadAverage) {
        this.event = event ;
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
