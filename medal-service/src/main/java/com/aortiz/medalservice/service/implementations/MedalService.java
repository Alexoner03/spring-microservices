package com.aortiz.medalservice.service.implementations;

import com.aortiz.medalservice.entities.Medal;
import com.aortiz.medalservice.service.contracts.IMedalService;
import com.aortiz.medalservice.service.dao.MedalsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedalService implements IMedalService {

    private MedalsDAO medalsDAO;

    @Autowired
    public MedalService(MedalsDAO medalsDAO) {
        this.medalsDAO = medalsDAO;
    }

    @Override
    public List<Medal> findAll() {
        return this.medalsDAO.findAll();
    }

    @Override
    public Medal findOne(int id) {
        return this.medalsDAO.findById(id).orElse(null);
    }

    @Override
    public Medal save(Medal medal) {
        return this.medalsDAO.save(medal);
    }

    @Override
    public List<Medal> findByJudokaId(int id) {
        return this.medalsDAO.findByJudokaId(id);
    }
}
