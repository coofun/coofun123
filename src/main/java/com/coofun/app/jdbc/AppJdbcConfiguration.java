package com.coofun.app.jdbc;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@Configuration
@EnableJdbcRepositories(value = "com.coofun.app.jdbc.repository")
public class AppJdbcConfiguration extends AbstractJdbcConfiguration {
}
