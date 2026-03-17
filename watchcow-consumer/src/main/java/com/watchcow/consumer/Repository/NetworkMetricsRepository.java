package com.watchcow.consumer.Repository;

import com.watchcow.consumer.Entities.NetworkMetricsEntity;
import com.watchcow.consumer.Entities.ServerMetricsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkMetricsRepository extends JpaRepository<NetworkMetricsEntity,Long> {

}
