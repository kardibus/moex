package com.kardibus.moex.service.moex;

import com.kardibus.moex.configuration.MoexServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.io.StringReader;
import java.util.Objects;

@Service
public class MoexServiceImpl implements MoexService {

    private MoexServiceApi moexServiceApi;

    @Autowired
    public MoexServiceImpl(@Qualifier(value = "RestTemplate") MoexServiceApi moexServiceApi) {
        this.moexServiceApi = moexServiceApi;
    }

    @Override
    public StringReader getSecuritiesApi(String secid) {
        moexServiceApi.getHttpHeaders().setContentType(MediaType.APPLICATION_XML);
        return new StringReader(Objects.requireNonNull(moexServiceApi
                .getRestTemplate()
                .getForObject("http://iss.moex.com/iss/securities.xml?q=" + secid, String.class)));
    }
}
