package com.kardibus.moex.dao;

import com.kardibus.moex.domain.data.CommonData;
import com.kardibus.moex.repository.CommonHisSecRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.List;

@Component
public class CommonHisSecDAO {

    private CommonHisSecRepo commonHisSecRepo;

    @Autowired
    public CommonHisSecDAO(CommonHisSecRepo commonHisSecRepo) {
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
