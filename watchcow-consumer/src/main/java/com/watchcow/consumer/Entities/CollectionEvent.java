package com.watchcow.consumer.Entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name="collection_event")
public class CollectionEvent {

    @Id
    @GeneratedValue
    private long id;


    private String agentId;
    private Instant collectionTime ;


    @OneToMany(mappedBy = "event_id" , cascade = CascadeType.ALL)
    private List<NetworkMetricsEntity> networkMetricsEntities ;

    @OneToMany(mappedBy = "event_id" , cascade = CascadeType.ALL)
    private List<ServerMetricsEntity> serverMetricsEntities ;

    public CollectionEvent(String agentId, Instant collectionTime) {
        this.agentId = agentId;
        this.collectionTime = collectionTime;
    }
}
