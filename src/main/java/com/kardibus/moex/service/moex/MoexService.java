package com.kardibus.moex.service.moex;

import java.io.StringReader;

public interface MoexService {

    StringReader getSecuritiesApi(String secid);
}
