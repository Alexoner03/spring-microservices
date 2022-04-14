package com.aortiz.medalservice.service.contracts;

import com.aortiz.medalservice.entities.Medal;

import java.util.List;

public interface IMedalService {
    List<Medal> findAll();
    Medal findOne(int id);
    Medal save(Medal medal);
    List<Medal> findByJudokaId(int id);
}
