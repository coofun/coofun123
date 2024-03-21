package com.coofun.app.jdbc.repository;

import com.coofun.app.entity.AppTracking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppTrackingJdbcRepository extends CrudRepository<AppTracking, String> {
}
