package com.kardibus.moex.dao;

import com.kardibus.moex.domain.entity.HistoryEntity;
import com.kardibus.moex.repository.HistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class HistoryDAO {

    private HistoryRepo historyRepo;

    @Autowired
    public HistoryDAO(HistoryRepo historyRepo) {
        this.historyRepo = historyRepo;
    }

    public Optional<HistoryEntity> getOneHistory(Long id) {
        return historyRepo.findById(id);
    }

    public List<HistoryEntity> getAllHistory() {
        return historyRepo.findAll();
    }

    public void deleteHistory(Long id) {
        historyRepo.deleteById(id);
    }

    public List<HistoryEntity> createHistory(Map<String, String> historyEntity) {
        HistoryEntity history = new HistoryEntity();
        history.setTRADEDATE(historyEntity.get("tradedate"));
        history.setLOW(historyEntity.get("low"));
        history.setLEGALCLOSEPRICE(historyEntity.get("legalcloseprice"));
        history.setHIGH(historyEntity.get("high"));
        history.setCLOSE(historyEntity.get("close"));
        history.setVALUE(historyEntity.get("value"));
        history.setBOARDID(historyEntity.get("boardid"));
        history.setOPEN(historyEntity.get("open"));
        history.setVOLUME(historyEntity.get("volume"));
      //  history.setSECID(historyEntity.get("secid"));
        history.setNUMTRADES(historyEntity.get("numtrades"));
        history.setSHORTNAME(historyEntity.get("shortname"));
        history.setWAPRICE(historyEntity.get("waprice"));
        history.setMARKETPRICE2(historyEntity.get("marketprice2"));
        history.setWAVAL(historyEntity.get("waval"));
        history.setMP2VALTRD(historyEntity.get("mp2VALTRD"));
        history.setMARKETPRICE3(historyEntity.get("marketprice3"));
        history.setADMITTEDQUOTE(historyEntity.get("admittedquote"));
        history.setADMITTEDVALUE(historyEntity.get("admittedvalue"));
        history.setMARKETPRICE3TRADESVALUE(historyEntity.get("marketprice3TRADESVALUE"));
        historyRepo.save(history);
        return getAllHistory();
    }

    public List<HistoryEntity> updateHistory(HistoryEntity id,Map<String,String> historyEntity) {
        id.setTRADEDATE(historyEntity.get("tradedate"));
        id.setLOW(historyEntity.get("low"));
        id.setLEGALCLOSEPRICE(historyEntity.get("legalcloseprice"));
        id.setHIGH(historyEntity.get("high"));
        id.setCLOSE(historyEntity.get("close"));
        id.setVALUE(historyEntity.get("value"));
        id.setBOARDID(historyEntity.get("boardid"));
        id.setOPEN(historyEntity.get("open"));
        id.setVOLUME(historyEntity.get("volume"));
     //   id.setSECID(historyEntity.get("secid"));
        id.setNUMTRADES(historyEntity.get("numtrades"));
        id.setSHORTNAME(historyEntity.get("shortname"));
        id.setWAPRICE(historyEntity.get("waprice"));
        id.setMARKETPRICE2(historyEntity.get("marketprice2"));
        id.setWAVAL(historyEntity.get("waval"));
        id.setMP2VALTRD(historyEntity.get("mp2VALTRD"));
        id.setMARKETPRICE3(historyEntity.get("marketprice3"));
        id.setADMITTEDQUOTE(historyEntity.get("admittedquote"));
        id.setADMITTEDVALUE(historyEntity.get("admittedvalue"));
        id.setMARKETPRICE3TRADESVALUE(historyEntity.get("marketprice3TRADESVALUE"));
        historyRepo.save(id);
        return getAllHistory();
    }
}
