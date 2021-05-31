package com.kardibus.moex.dto;

import com.kardibus.moex.domain.entity.SecuritiesEntity;
import com.kardibus.moex.repository.SecuritiesRepo;
import com.kardibus.moex.service.moex.MoexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.StringReader;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public class SecuritiesDTO {

    private SecuritiesRepo securitiesRepo;
    private MoexService moexService;

    @Autowired
    public SecuritiesDTO(SecuritiesRepo securitiesRepo, MoexService moexService) {
        this.securitiesRepo = securitiesRepo;
        this.moexService=moexService;
    }

    public Optional<SecuritiesEntity> getOneSecurities(Long id) {
        return securitiesRepo.findById(id);
    }

    public List<SecuritiesEntity> getAllSecurities() {
        return securitiesRepo.findAll();
    }

    public void deleteSecurities(String id) {
        securitiesRepo.delete(securitiesRepo.findBySecid(id));
    }

    public List<SecuritiesEntity> createSecurities(Map<String, String> securitiesEntity) {

        SecuritiesEntity securities = new SecuritiesEntity();

        securities.setId(Long.valueOf(securitiesEntity.get("id")));
        securities.setSecid(securitiesEntity.get("secid"));
        securities.setShortname(securitiesEntity.get("shortname"));
        securities.setRegnumber(securitiesEntity.get("regnumber"));
        securities.setName(securitiesEntity.get("name"));
        securities.setIsin(securitiesEntity.get("isin"));
        securities.setIs_traded(Integer.parseInt(securitiesEntity.get("is_traded")));
        securities.setEmitent_id(Integer.parseInt(securitiesEntity.get("emitent_id")));
        securities.setEmitent_title(securitiesEntity.get("emitent_title"));
        securities.setEmitent_inn(securitiesEntity.get("emitent_inn"));
        securities.setEmitent_okpo(securitiesEntity.get("emitent_okpo"));
        securities.setGosreg(securitiesEntity.get("gosreg"));
        securities.setType(securitiesEntity.get("type"));
        securities.setGroup_(securitiesEntity.get("group_"));
        securities.setPrimary_boardid(securitiesEntity.get("primary_boardid"));
        securities.setMarketprice_boardid(securitiesEntity.get("marketprice_boardid"));

        securitiesRepo.save(securities);
        return getAllSecurities();
    }

    public List<SecuritiesEntity> updateSecurities(SecuritiesEntity id, Map<String, String> securitiesEntity) {

        id.setSecid(securitiesEntity.get("secid"));
        id.setShortname(securitiesEntity.get("shortname"));
        id.setRegnumber(securitiesEntity.get("regnumber"));
        id.setName(securitiesEntity.get("name"));
        id.setIsin(securitiesEntity.get("isin"));
        id.setIs_traded(Integer.parseInt(securitiesEntity.get("is_traded")));
        id.setEmitent_id(Integer.parseInt(securitiesEntity.get("emitent_id")));
        id.setEmitent_title(securitiesEntity.get("emitent_title"));
        id.setEmitent_inn(securitiesEntity.get("emitent_inn"));
        id.setEmitent_okpo(securitiesEntity.get("emitent_okpo"));
        id.setGosreg(securitiesEntity.get("gosreg"));
        id.setType(securitiesEntity.get("type"));
        id.setGroup_(securitiesEntity.get("group_"));
        id.setPrimary_boardid(securitiesEntity.get("primary_boardid"));
        id.setMarketprice_boardid(securitiesEntity.get("marketprice_boardid"));

        securitiesRepo.save(id);

        return getAllSecurities();
    }

    public StringReader addSecuritiesApi(String secid){
       return moexService.getSecuritiesApi(secid);
    }
}
