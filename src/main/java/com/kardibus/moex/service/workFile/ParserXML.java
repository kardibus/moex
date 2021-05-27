package com.kardibus.moex.service.workFile;


import com.kardibus.moex.domain.entity.HistoryEntity;
import com.kardibus.moex.domain.entity.SecuritiesEntity;
import com.kardibus.moex.domain.objectXML.history.DocumentXML;
import com.kardibus.moex.domain.objectXML.history.RowXML;
import com.kardibus.moex.domain.objectXML.securities.DocumentXMLSecurities;
import com.kardibus.moex.domain.objectXML.securities.RowXMLSecurities;
import com.kardibus.moex.repository.HistoryRepo;
import com.kardibus.moex.repository.SecuritiesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class ParserXML {

    @Value("${upload.path}")
    private String uploadPath;

    private HistoryRepo historyRepo;
    private SecuritiesRepo securitiesRepo;

    public ParserXML() { }

    @Autowired
    public ParserXML(HistoryRepo historyRepo, SecuritiesRepo securitiesRepo) {
        this.historyRepo = historyRepo;
        this.securitiesRepo = securitiesRepo;

    }

    public void run() throws JAXBException, FileNotFoundException {

       if (getDataParseValue(DocumentXML.class).getDataXML().get(0).getId().equals("history")){
           parserHistory(getDataParseValue(DocumentXML.class));
       }else {
           parserSecurities(getDataParseValue(DocumentXMLSecurities.class));
       }
    }

    public <T> T getDataParseValue(Class<T> t) throws JAXBException, FileNotFoundException {
        JAXBContext context  = JAXBContext.newInstance(t);
        Unmarshaller um = context.createUnmarshaller();
        T res = (T) um.unmarshal(new java.io.FileReader(uploadPath));
        return res;
    }

    private void parserHistory(DocumentXML res) {

        List<HistoryEntity> historyEntityList = new ArrayList<>();

        if (res.getDataXML().get(0).getId().equals("history")) {
            System.out.println("Data: " + res.getDataXML().get(0).getId());

            for (RowXML list : res.getDataXML().get(0).getRowsXML().getRowXMLS()) {

                if (securitiesRepo.findBySecid(list.getSECID()) != null) {
                    HistoryEntity historyEntity = new HistoryEntity();

                    historyEntity.setBOARDID(list.getBOARDID());
                    historyEntity.setTRADEDATE(Date.valueOf(list.getTRADEDATE()));
                    historyEntity.setSHORTNAME(list.getSHORTNAME());

                    historyEntity.setSecid(securitiesRepo.findBySecid(list.getSECID()));
                    historyEntity.setNUMTRADES(list.getNUMTRADES());
                    historyEntity.setVALUE(list.getVALUE());
                    historyEntity.setOPEN(list.getOPEN());
                    historyEntity.setLOW(list.getLOW());
                    historyEntity.setHIGH(list.getHIGH());
                    historyEntity.setLEGALCLOSEPRICE(list.getLEGALCLOSEPRICE());
                    historyEntity.setWAPRICE(list.getWAPRICE());
                    historyEntity.setCLOSE(list.getCLOSE());
                    historyEntity.setVOLUME(list.getVOLUME());
                    historyEntity.setMARKETPRICE2(list.getMARKETPRICE2());
                    historyEntity.setMARKETPRICE3(list.getMARKETPRICE3());
                    historyEntity.setADMITTEDQUOTE(list.getADMITTEDQUOTE());
                    historyEntity.setMP2VALTRD(list.getMP2VALTRD());
                    historyEntity.setMARKETPRICE3TRADESVALUE(list.getMARKETPRICE3TRADESVALUE());
                    historyEntity.setADMITTEDVALUE(list.getADMITTEDVALUE());
                    historyEntity.setWAVAL(list.getWAVAL());

                    historyEntityList.add(historyEntity);
                }
            }
            historyRepo.saveAll(historyEntityList);
        }
    }

    private void parserSecurities(DocumentXMLSecurities res) {

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

