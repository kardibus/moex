package com.kardibus.moex.repository;

import com.kardibus.moex.domain.data.CommonData;
import com.kardibus.moex.domain.entity.SecuritiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonHisSecRepo extends JpaRepository<SecuritiesEntity, Long> {

    @Query(value = "select new com.kardibus.moex.domain.data.CommonData(se.secid,se.regnumber,se.name,se.emitent_title,hi.TRADEDATE,hi.OPEN,hi.CLOSE,hi.NUMTRADES) from SecuritiesEntity se join HistoryEntity hi on se.secid = hi.secid")
    List<CommonData> getAllCommonHisSec();

}
