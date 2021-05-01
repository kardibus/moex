package com.kardibus.moex.controller.api;

import com.kardibus.moex.dao.CommonHisSecDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
