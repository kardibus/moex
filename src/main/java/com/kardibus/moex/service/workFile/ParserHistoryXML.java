package com.kardibus.moex.service.workFile;


import com.kardibus.moex.domain.entity.HistoryEntity;
import com.kardibus.moex.domain.objectXML.history.DocumentXML;
import com.kardibus.moex.domain.objectXML.history.RowXML;
import com.kardibus.moex.repository.HistoryRepo;
import com.kardibus.moex.repository.SecuritiesRepo;
import com.thoughtworks.xstream.XStream;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class ParserHistoryXML extends Thread {

    @Value("${upload.path}")
    private String uploadPath;

    private HistoryRepo historyRepo;
    private SecuritiesRepo securitiesRepo;

    @Autowired
    public ParserHistoryXML(HistoryRepo historyRepo,SecuritiesRepo securitiesRepo) {
        this.historyRepo = historyRepo;
        this.securitiesRepo = securitiesRepo;

    }

    @SneakyThrows
    @Override
    public void run() {
        parser();
    }

    private void parser() {
       XStream xStream = new XStream();

        File file = new File(uploadPath);

        xStream.processAnnotations(DocumentXML.class);

        DocumentXML res = (DocumentXML) xStream.fromXML(file);

        List<HistoryEntity> historyEntityList = new ArrayList<>();

        if (res.getDataXML().get(0).getId().equals("history")) {
            System.out.println("Data: " + res.getDataXML().get(0).getId());

            for (RowXML list : res.getDataXML().get(0).getRowsXML().getRowXMLS()) {

                if (securitiesRepo.findBySecid(list.getSECID()) != null) {
                    HistoryEntity historyEntity = new HistoryEntity();

                    historyEntity.setBOARDID(list.getBOARDID());
                    historyEntity.setTRADEDATE(list.getTRADEDATE());
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
}

