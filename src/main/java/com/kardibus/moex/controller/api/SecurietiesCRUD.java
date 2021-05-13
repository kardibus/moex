package com.kardibus.moex.controller.api;

import com.kardibus.moex.dao.SecuritiesDAO;
import com.kardibus.moex.domain.entity.SecuritiesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class SecurietiesCRUD {

    private SecuritiesDAO securitiesDAO;

    @Autowired
    public SecurietiesCRUD(SecuritiesDAO securitiesDAO) {
        this.securitiesDAO = securitiesDAO;
    }

    @GetMapping("securities")
    public List<SecuritiesEntity> gelAllSecurities() {
        return securitiesDAO.getAllSecurities();
    }

    @GetMapping("securities/{id}")
    public Optional<SecuritiesEntity> getOneSecurities(@PathVariable("id") Long id) {
        return securitiesDAO.getOneSecurities(id);
    }

    @DeleteMapping("securities/{id}")
    public void deleteSecurities(@PathVariable("id") String id) {
        securitiesDAO.deleteSecurities(id);
    }

    @PutMapping("securities/{id}")
    public List<SecuritiesEntity> updateSecurities(@PathVariable("id") SecuritiesEntity id,@RequestBody Map<String,String> securities) {
        return securitiesDAO.updateSecurities(id,securities);
    }

    @PostMapping("securities")
    public List<SecuritiesEntity> createSecurities(@RequestBody Map<String,String> securities) {
        return securitiesDAO.createSecurities(securities);
    }
}
