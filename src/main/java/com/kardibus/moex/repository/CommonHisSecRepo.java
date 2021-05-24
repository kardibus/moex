package com.kardibus.moex.repository;

import com.kardibus.moex.domain.data.CommonData;
import com.kardibus.moex.domain.entity.SecuritiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface CommonHisSecRepo extends JpaRepository<SecuritiesEntity, Long> {

    @Query(value = "select new com.kardibus.moex.domain.data.CommonData(se.secid,se.regnumber,se.name,se.emitent_title,hi.TRADEDATE,hi.OPEN,hi.CLOSE,hi.NUMTRADES) from SecuritiesEntity se join HistoryEntity hi on se.secid = hi.secid")
    List<CommonData> getAllCommonHisSec();

    @Query(value = "select new com.kardibus.moex.domain.data.CommonData(se.secid,se.regnumber,se.name,se.emitent_title,hi.TRADEDATE,hi.OPEN,hi.CLOSE,hi.NUMTRADES)" +
            " from SecuritiesEntity se join HistoryEntity hi on se.secid = hi.secid where se.emitent_title like %:emt% order by se.emitent_title  asc ")
    List<CommonData> findByEmitent_titleSort(@Param("emt") String emt);

    @Query(value = "select new com.kardibus.moex.domain.data.CommonData(se.secid,se.regnumber,se.name,se.emitent_title,hi.TRADEDATE,hi.OPEN,hi.CLOSE,hi.NUMTRADES)" +
            " from SecuritiesEntity se join HistoryEntity hi on se.secid = hi.secid where hi.TRADEDATE =:trd  order by hi.TRADEDATE  asc ")
    List<CommonData> findByTradeDateSort(@Param("trd") Date trd);
}
