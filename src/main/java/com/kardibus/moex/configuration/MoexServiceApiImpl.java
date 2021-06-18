package com.kardibus.moex.configuration;

import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;



public class MoexServiceApiImpl implements MoexServiceApi{
    @Override
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Override
    public HttpHeaders getHttpHeaders() {
        return new HttpHeaders();
    }
}
