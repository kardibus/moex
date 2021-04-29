package com.kardibus.moex.repository;

import com.kardibus.moex.domain.entity.HistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepo extends JpaRepository<HistoryEntity, Long> {
}
