package com.kardibus.moex.service.moex;

public interface MoexService {

    <T> T getSecuritiesApi(String secid);
}
