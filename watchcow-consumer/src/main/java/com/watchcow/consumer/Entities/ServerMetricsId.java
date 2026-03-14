package com.watchcow.consumer.Entities;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Embeddable
public class ServerMetricsId implements Serializable {

    private String agentId;
    private Instant collectionTime ;

    public ServerMetricsId() {
    }

    public ServerMetricsId(String agentId, Instant collectionTime) {
        this.agentId = agentId;
        this.collectionTime = collectionTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServerMetricsId that = (ServerMetricsId) o;
        return Objects.equals(agentId, that.agentId) && Objects.equals(collectionTime, that.collectionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId, collectionTime);
    }
}
