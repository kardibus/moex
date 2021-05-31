package com.kardibus.moex.dto;

import com.kardibus.moex.domain.entity.HistoryEntity;
import com.kardibus.moex.repository.HistoryRepo;
import com.kardibus.moex.repository.SecuritiesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public class HistoryDTO {

    private HistoryRepo historyRepo;
    private SecuritiesRepo securitiesRepo;

    @Autowired
    public HistoryDTO(HistoryRepo historyRepo, SecuritiesRepo securitiesRepo) {
        this.historyRepo = historyRepo;
        this.securitiesRepo = securitiesRepo;
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

    public List<HistoryEntity> createHistory(Map<String, String> historyEntity) throws ParseException {
        HistoryEntity history = new HistoryEntity();

        history.setTRADEDATE(Date.valueOf(historyEntity.get("tradedate")));
        history.setLOW(Double.valueOf(historyEntity.get("low")));
        history.setLEGALCLOSEPRICE(Double.valueOf(historyEntity.get("legalcloseprice")));
        history.setHIGH(Double.valueOf(historyEntity.get("high")));
        history.setCLOSE(Double.valueOf(historyEntity.get("close")));
        history.setVALUE(Double.valueOf(historyEntity.get("value")));
        history.setBOARDID(historyEntity.get("boardid"));
        history.setOPEN(Double.valueOf(historyEntity.get("open")));
        history.setVOLUME(Double.valueOf(historyEntity.get("volume")));
        history.setSecid(securitiesRepo.findBySecid(historyEntity.get("secid")));
        history.setNUMTRADES(Double.valueOf(historyEntity.get("numtrades")));
        history.setSHORTNAME(historyEntity.get("shortname"));
        history.setWAPRICE(Double.valueOf(historyEntity.get("waprice")));
        history.setMARKETPRICE2(Double.valueOf(historyEntity.get("marketprice2")));
        history.setWAVAL(Double.valueOf(historyEntity.get("waval")));
        history.setMP2VALTRD(Double.valueOf(historyEntity.get("mp2VALTRD")));
        history.setMARKETPRICE3(Double.valueOf(historyEntity.get("marketprice3")));
        history.setADMITTEDQUOTE(Double.valueOf(historyEntity.get("admittedquote")));
        history.setADMITTEDVALUE(Double.valueOf(historyEntity.get("admittedvalue")));
        history.setMARKETPRICE3TRADESVALUE(Double.valueOf(historyEntity.get("marketprice3TRADESVALUE")));
        historyRepo.save(history);
        return getAllHistory();
    }

    public List<HistoryEntity> updateHistory(HistoryEntity id, Map<String, String> historyEntity) throws ParseException {
        id.setTRADEDATE(Date.valueOf(historyEntity.get("tradedate")));
        id.setLOW(Double.valueOf(historyEntity.get("low")));
        id.setLEGALCLOSEPRICE(Double.valueOf(historyEntity.get("legalcloseprice")));
        id.setHIGH(Double.valueOf(historyEntity.get("high")));
        id.setCLOSE(Double.valueOf(historyEntity.get("close")));
        id.setVALUE(Double.valueOf(historyEntity.get("value")));
        id.setBOARDID(historyEntity.get("boardid"));
        id.setOPEN(Double.valueOf(historyEntity.get("open")));
        id.setVOLUME(Double.valueOf(historyEntity.get("volume")));
        id.setSecid(securitiesRepo.findBySecid(historyEntity.get("secid")));
        id.setNUMTRADES(Double.valueOf(historyEntity.get("numtrades")));
        id.setSHORTNAME(historyEntity.get("shortname"));
        id.setWAPRICE(Double.valueOf(historyEntity.get("waprice")));
        id.setMARKETPRICE2(Double.valueOf(historyEntity.get("marketprice2")));
        id.setWAVAL(Double.valueOf(historyEntity.get("waval")));
        id.setMP2VALTRD(Double.valueOf(historyEntity.get("mp2VALTRDб")));
        id.setMARKETPRICE3(Double.valueOf(historyEntity.get("marketprice3")));
        id.setADMITTEDQUOTE(Double.valueOf(historyEntity.get("admittedquote")));
        id.setADMITTEDVALUE(Double.valueOf(historyEntity.get("admittedvalue")));
        id.setMARKETPRICE3TRADESVALUE(Double.valueOf(historyEntity.get("marketprice3TRADESVALUE")));
        historyRepo.save(id);
        return getAllHistory();
    }

    public HistoryEntity getOneTradeDate(String s){
        return historyRepo.findBySecid(s);
    }
}
