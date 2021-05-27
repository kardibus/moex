package com.kardibus.moex.repository;

import com.kardibus.moex.domain.entity.HistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface HistoryRepo extends JpaRepository<HistoryEntity, Long> {

    HistoryEntity findBySecid(String s);
}
