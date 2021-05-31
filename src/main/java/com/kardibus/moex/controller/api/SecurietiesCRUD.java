package com.kardibus.moex.controller.api;

import com.kardibus.moex.dto.SecuritiesDTO;
import com.kardibus.moex.domain.entity.SecuritiesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class SecurietiesCRUD {

    private SecuritiesDTO securitiesDTO;

    @Autowired
    public SecurietiesCRUD(SecuritiesDTO securitiesDTO) {
        this.securitiesDTO = securitiesDTO;
    }

    @GetMapping("securities")
    public List<SecuritiesEntity> gelAllSecurities() {
        return securitiesDTO.getAllSecurities();
    }

    @GetMapping("securities/{id}")
    public Optional<SecuritiesEntity> getOneSecurities(@PathVariable("id") Long id) {
        return securitiesDTO.getOneSecurities(id);
    }

    @DeleteMapping("securities/{id}")
    public void deleteSecurities(@PathVariable("id") String id) {
        securitiesDTO.deleteSecurities(id);
    }

    @PutMapping("securities/{id}")
    public List<SecuritiesEntity> updateSecurities(@PathVariable("id") SecuritiesEntity id,@RequestBody Map<String,String> securities) {
        return securitiesDTO.updateSecurities(id,securities);
    }

    @PostMapping("securities")
    public List<SecuritiesEntity> createSecurities(@RequestBody Map<String,String> securities) {
        return securitiesDTO.createSecurities(securities);
    }
}
