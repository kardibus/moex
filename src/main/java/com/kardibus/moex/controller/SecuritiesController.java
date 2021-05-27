package com.kardibus.moex.controller;

import com.kardibus.moex.dto.SecuritiesDAO;
import com.kardibus.moex.domain.entity.SecuritiesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("securities")
public class SecuritiesController {

    private SecuritiesDAO securitiesDAO;

    @Autowired
    public SecuritiesController(SecuritiesDAO securitiesDAO) {
        this.securitiesDAO = securitiesDAO;
    }

    @GetMapping
    public String getAllSecurities(Model model){
        model.addAttribute("securities",securitiesDAO.getAllSecurities());
        return "securities";
    }

    @PostMapping("/delete/{id}")
    public String deleteSecurities(@PathVariable("id") String id,Model model) {
        securitiesDAO.deleteSecurities(id);
        return "redirect:/securities";
    }

    @PostMapping("/update/")
    public String updateSecurities(@RequestParam("id") SecuritiesEntity id, @RequestParam("secid") String secid, @RequestParam("shortname") String shortname,
                                                   @RequestParam("regnumber") String regnumber, @RequestParam("name") String name,
                                                   @RequestParam("isin") String isin, @RequestParam("is_traded") String is_traded,
                                                   @RequestParam("emitent_id") String emitent_id, @RequestParam("emitent_title") String emitent_title,
                                                   @RequestParam("emitent_inn") String emitent_inn, @RequestParam("emitent_okpo") String emitent_okpo,
                                                   @RequestParam("gosreg") String gosreg, @RequestParam("type") String type, @RequestParam("group_") String group_,
                                                   @RequestParam("primary_boardid") String primary_boardid, @RequestParam("marketprice_boardid") String marketprice_boardid) {
        Map<String,String> map = new HashMap<>();
        map.put("secid",secid);
        map.put("shortname",shortname);
        map.put("regnumber",regnumber);
        map.put("name",name);
        map.put("isin",isin);
        map.put("is_traded",is_traded);
        map.put("emitent_id",emitent_id);
        map.put("emitent_title",emitent_title);
        map.put("emitent_inn",emitent_inn);
        map.put("emitent_okpo",emitent_okpo);
        map.put("gosreg",gosreg);
        map.put("type",type);
        map.put("group_",group_);
        map.put("primary_boardid",primary_boardid);
        map.put("marketprice_boardid",marketprice_boardid);

        securitiesDAO.updateSecurities(id,map);
        return "redirect:/securities";
    }

    @PostMapping("/create")
    public String createSecurities(@RequestParam("id") String id,@RequestParam("secid") String secid, @RequestParam("shortname") String shortname,
                                   @RequestParam("regnumber") String regnumber, @RequestParam("name") String name,
                                   @RequestParam("isin") String isin, @RequestParam("is_traded") String is_traded,
                                   @RequestParam("emitent_id") String emitent_id, @RequestParam("emitent_title") String emitent_title,
                                   @RequestParam("emitent_inn") String emitent_inn, @RequestParam("emitent_okpo") String emitent_okpo,
                                   @RequestParam("gosreg") String gosreg, @RequestParam("type") String type, @RequestParam("group_") String group_,
                                   @RequestParam("primary_boardid") String primary_boardid, @RequestParam("marketprice_boardid") String marketprice_boardid) {
        Map<String,String> map = new HashMap<>();
        map.put("id",id);
        map.put("secid",secid);
        map.put("shortname",shortname);
        map.put("regnumber",regnumber);
        map.put("name",name);
        map.put("isin",isin);
        map.put("is_traded",is_traded);
        map.put("emitent_id",emitent_id);
        map.put("emitent_title",emitent_title);
        map.put("emitent_inn",emitent_inn);
        map.put("emitent_okpo",emitent_okpo);
        map.put("gosreg",gosreg);
        map.put("type",type);
        map.put("group_",group_);
        map.put("primary_boardid",primary_boardid);
        map.put("marketprice_boardid",marketprice_boardid);

        securitiesDAO.createSecurities(map);
        return "redirect:/securities";
    }
}
