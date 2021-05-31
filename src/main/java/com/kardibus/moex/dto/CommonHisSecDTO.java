package com.kardibus.moex.dto;

import com.kardibus.moex.domain.data.CommonData;
import com.kardibus.moex.repository.CommonHisSecRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.List;

@Component
public class CommonHisSecDTO {

    private CommonHisSecRepo commonHisSecRepo;

    @Autowired
    public CommonHisSecDTO(CommonHisSecRepo commonHisSecRepo) {
        this.commonHisSecRepo = commonHisSecRepo;
    }

    public List<CommonData> getAllCommon() {
        return commonHisSecRepo.getAllCommonHisSec();
    }

    public List<CommonData> getEmitent_titleFilter(String emt){
        return commonHisSecRepo.findByEmitent_titleSort(emt);
    }

    public List<CommonData> getTradedateFilter(Date tdd){
         return commonHisSecRepo.findByTradeDateSort(tdd);
    }
}
