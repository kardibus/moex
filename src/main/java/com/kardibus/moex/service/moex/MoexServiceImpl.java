package com.kardibus.moex.service.moex;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.StringReader;

@Service
public class MoexServiceImpl implements MoexService {


    @Override
    public StringReader getSecuritiesApi(String secid) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_XML);

        return new StringReader(restTemplate.getForObject("http://iss.moex.com/iss/securities.xml?q=" + secid, String.class));
    }
}
