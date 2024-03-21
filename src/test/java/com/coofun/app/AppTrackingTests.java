package com.coofun.app;

import com.coofun.app.jdbc.repository.AppTrackingJdbcRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest(classes = com.coofun.Main.class)
@ComponentScan(value = "com.coofun.app")
public class AppTrackingTests {
    private final AppTrackingJdbcRepository appTrackingJdbcRepository;

    @Autowired
    public AppTrackingTests(AppTrackingJdbcRepository appTrackingJdbcRepository) {
        this.appTrackingJdbcRepository = appTrackingJdbcRepository;
    }

    @Test
    public void testAppTrackingJdbcRepository() {
        Assertions.assertNotNull(this.appTrackingJdbcRepository.findAllIds());
    }
}
