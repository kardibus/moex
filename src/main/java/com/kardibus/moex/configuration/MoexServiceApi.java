package com.kardibus.moex.configuration;

import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;


public interface MoexServiceApi {
    RestTemplate getRestTemplate();

    HttpHeaders getHttpHeaders();
}
