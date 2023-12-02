package com.example.testSpringBoot;

import org.springframework.context.annotation.Bean;

public class JavaConfig {
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
