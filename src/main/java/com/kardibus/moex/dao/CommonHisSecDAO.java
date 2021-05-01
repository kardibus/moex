package com.kardibus.moex.dao;

import com.kardibus.moex.domain.entity.CommonEntity;
import com.kardibus.moex.domain.entity.SecuritiesEntity;
import com.kardibus.moex.repository.CommonHisSecRepo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommonHisSecDAO {

    private CommonHisSecRepo commonHisSecRepo;

    public CommonHisSecDAO(CommonHisSecRepo commonHisSecRepo) {
        this.commonHisSecRepo = commonHisSecRepo;
    }

    public List<CommonEntity> getAllCommon() {
        return commonHisSecRepo.getAllCommonHisSec();
    }
}
