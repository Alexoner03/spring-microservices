package com.aortiz.medalservice.service.dao;

import com.aortiz.medalservice.entities.Medal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedalsDAO extends JpaRepository<Medal, Integer> {
    List<Medal> findByJudokaId(int id);
}
