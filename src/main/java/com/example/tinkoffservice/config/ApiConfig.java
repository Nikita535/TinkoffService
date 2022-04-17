package com.example.tinkoffservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "api")
public class ApiConfig {
    private Boolean isSandBoxMode;
}