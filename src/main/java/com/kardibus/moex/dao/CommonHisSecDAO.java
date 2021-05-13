package com.kardibus.moex.dao;

import com.kardibus.moex.domain.data.CommonData;
import com.kardibus.moex.repository.CommonHisSecRepo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommonHisSecDAO {

    private CommonHisSecRepo commonHisSecRepo;

    public CommonHisSecDAO(CommonHisSecRepo commonHisSecRepo) {
        this.commonHisSecRepo = commonHisSecRepo;
    }

    public List<CommonData> getAllCommon() {
        return commonHisSecRepo.getAllCommonHisSec();
    }
}
