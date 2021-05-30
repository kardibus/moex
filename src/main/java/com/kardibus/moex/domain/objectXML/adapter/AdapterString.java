package com.kardibus.moex.domain.objectXML.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class AdapterString extends XmlAdapter<String,String> {

    @Override
    public String unmarshal(String s) throws Exception {
        return s.equals("") || s == null?"0.0":s;
    }

    @Override
    public String marshal(String s) throws Exception {
        return null;
    }
}
