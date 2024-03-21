package com.coofun.app.jdbc.repository;

import com.coofun.app.entity.AppTracking;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppTrackingJdbcRepository extends CrudRepository<AppTracking, String> {
    @Query("""
            select id from t_app_tracking
            """)
    List<String> findAllIds();
}
