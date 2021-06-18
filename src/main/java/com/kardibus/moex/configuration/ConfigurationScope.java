package com.kardibus.moex.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(value = "Http")
public class ConfigurationScope {

    @Bean(name = "RestTemplate")
    public MoexServiceApi getRestTemplate() {
        return new MoexServiceApiImpl();
    }

    @Bean(name = "HttpHeaders")
    public MoexServiceApi getHttpHeaders() {
        return new MoexServiceApiImpl();
    }
}
