package com.kardibus.moex.repository;

import com.kardibus.moex.domain.entity.SecuritiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecuritiesRepo extends JpaRepository<SecuritiesEntity, Long> {
    SecuritiesEntity findBySecid(String secid);

}
