package com.watchcow.consumer.Repository;

import com.watchcow.consumer.Entities.ServerMetricsEntity;
import com.watchcow.consumer.Entities.ServerMetricsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerMetricsRepository extends JpaRepository<ServerMetricsEntity, Long> {

}
