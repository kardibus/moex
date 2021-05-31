package com.kardibus.moex.controller;

import com.kardibus.moex.dto.CommonHisSecDTO;
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

    private CommonHisSecDTO commonHisSecDTO;

    @Autowired
    public CommonHisSecConroller(CommonHisSecDTO commonHisSecDTO) {
        this.commonHisSecDTO = commonHisSecDTO;
    }

    @GetMapping("/")
    public String getCommonHisSec(Model model) {
        model.addAttribute("common", commonHisSecDTO.getAllCommon());
        return "common";
    }

    @PostMapping("/")
    public String getSearchCommonHisSec(@RequestParam("itemRow") String itemRow,@RequestParam(value = "filter",defaultValue = "") String filter
            ,Model model) {
        if (itemRow.equals("emitent_title")){
            model.addAttribute("common", commonHisSecDTO.getEmitent_titleFilter(filter));
        }else {
            model.addAttribute("common", commonHisSecDTO.getTradedateFilter(Date.valueOf(filter)));
        }
        return "common";
    }
}
