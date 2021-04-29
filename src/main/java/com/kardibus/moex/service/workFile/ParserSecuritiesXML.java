package com.kardibus.moex.service.workFile;

import com.kardibus.moex.domain.entity.SecuritiesEntity;
import com.kardibus.moex.domain.objectXML.securities.DocumentXMLSecurities;
import com.kardibus.moex.domain.objectXML.securities.RowXMLSecurities;
import com.kardibus.moex.repository.SecuritiesRepo;
import com.thoughtworks.xstream.XStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class ParserSecuritiesXML extends Thread {

    @Value("${upload.path}")
    private String uploadPath;

    private SecuritiesRepo securitiesRepo;

    @Autowired
    public ParserSecuritiesXML(SecuritiesRepo securitiesRepo) {
        this.securitiesRepo = securitiesRepo;
    }

    @Override
    public void run() {
        xStream();
    }


    private void xStream() {
        XStream xStream = new XStream();

        xStream.setMode(XStream.NO_REFERENCES);
        File f = new File(uploadPath);

        xStream.processAnnotations(DocumentXMLSecurities.class);

        DocumentXMLSecurities res = (DocumentXMLSecurities) xStream.fromXML(f);

        List<SecuritiesEntity> securitiesEntityList = new ArrayList<>();

        if (res.getDataXMLSecurities().get(0).getId().equals("securities")) {
            System.out.println("sec: " + res.getDataXMLSecurities().get(0).getId());

            for (RowXMLSecurities rxs : res.getDataXMLSecurities().get(0).getRowsXMLSecurities().getRowXMLSecurities()) {

                SecuritiesEntity securitiesEntity = new SecuritiesEntity();

                securitiesEntity.setId(Long.valueOf(rxs.getId()));
                securitiesEntity.setSecid(rxs.getSecid());
                securitiesEntity.setShortname(rxs.getShortname());
                securitiesEntity.setRegnumber(rxs.getRegnumber());
                securitiesEntity.setName(rxs.getName());
                securitiesEntity.setIsin(rxs.getIsin());
                securitiesEntity.setIs_traded(rxs.getIs_traded());
                securitiesEntity.setEmitent_id(rxs.getEmitent_id());
                securitiesEntity.setEmitent_title(rxs.getEmitent_title());
                securitiesEntity.setEmitent_inn(rxs.getEmitent_inn());
                securitiesEntity.setEmitent_okpo(rxs.getEmitent_okpo());
                securitiesEntity.setGosreg(rxs.getGosreg());
                securitiesEntity.setType(rxs.getType());
                securitiesEntity.setGroup_(rxs.getGroup());
                securitiesEntity.setPrimary_boardid(rxs.getPrimary_boardid());
                securitiesEntity.setMarketprice_boardid(rxs.getMarketprice_boardid());

                securitiesEntityList.add(securitiesEntity);
            }

            securitiesRepo.saveAll(securitiesEntityList);
        }

    }
}
