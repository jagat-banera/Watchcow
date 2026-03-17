package com.watchcow.consumer.Entities;


import jakarta.persistence.*;

@Entity
@Table(name = "network_metrics")
public class NetworkMetricsEntity {

    // ID
    @Id
    @GeneratedValue
    private long id ;


    @ManyToMany
    @JoinColumn(name = "event_id")
    private CollectionEvent event ;


    private String hostname ;
    private String version ;


    private String interfaceId ;
    private double receivedBytes ;
    private double transferBytes ;


    public NetworkMetricsEntity( CollectionEvent event , String hostname, String version, String interfaceId, double receivedBytes, double transferBytes) {
        this.event = event ;
        this.hostname = hostname;
        this.version = version;
        this.interfaceId = interfaceId;
        this.receivedBytes = receivedBytes;
        this.transferBytes = transferBytes;
    }

    public String getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
    }

    public double getReceivedBytes() {
        return receivedBytes;
    }

    public void setReceivedBytes(double receivedBytes) {
        this.receivedBytes = receivedBytes;
    }

    public double getTransferBytes() {
        return transferBytes;
    }

    public void setTransferBytes(double transferBytes) {
        this.transferBytes = transferBytes;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
