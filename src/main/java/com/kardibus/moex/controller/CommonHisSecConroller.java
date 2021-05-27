package com.kardibus.moex.controller;

import com.kardibus.moex.dto.CommonHisSecDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;

@Controller
@RequestMapping("/common")
public class CommonHisSecConroller {

    private CommonHisSecDAO commonHisSecDAO;

    @Autowired
    public CommonHisSecConroller(CommonHisSecDAO commonHisSecDAO) {
        this.commonHisSecDAO = commonHisSecDAO;
    }

    @GetMapping("/")
    public String getCommonHisSec(Model model) {
        model.addAttribute("common",commonHisSecDAO.getAllCommon());
        return "common";
    }

    @PostMapping("/")
    public String getSearchCommonHisSec(@RequestParam("itemRow") String itemRow,@RequestParam("filter") String filter
            ,Model model) {
        if (itemRow.equals("emitent_title")){
            model.addAttribute("common",commonHisSecDAO.getEmitent_titleFilter(filter));
        }else {
            model.addAttribute("common",commonHisSecDAO.getTradedateFilter(Date.valueOf(filter)));
        }
        return "redirect:/";
    }
}
