package com.kardibus.moex.service.moex;

import org.springframework.beans.factory.annotation.Autowired;

public class MoexServiceImpl implements MoexService{

    private MoexApi moexApi;

    @Autowired
    public MoexServiceImpl(MoexApi moexApi) {
        this.moexApi = moexApi;
    }

    @Override
    public <T> T getSecuritiesApi(String secid) {
        return null;
    }
}
