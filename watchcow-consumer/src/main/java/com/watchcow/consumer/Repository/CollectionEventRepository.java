package com.watchcow.consumer.Repository;

import com.watchcow.consumer.Entities.CollectionEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionEventRepository extends JpaRepository<CollectionEvent,Long> {
}
