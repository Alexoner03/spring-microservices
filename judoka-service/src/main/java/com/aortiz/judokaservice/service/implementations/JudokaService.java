package com.aortiz.judokaservice.service.implementations;

import com.aortiz.judokaservice.entities.locals.Judoka;
import com.aortiz.judokaservice.service.contracts.IJudokaService;
import com.aortiz.judokaservice.service.dao.JudokaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JudokaService implements IJudokaService {

    private final JudokaDAO judokaDAO;

    @Autowired
    public JudokaService(JudokaDAO judokaDAO) {
        this.judokaDAO = judokaDAO;
    }

    @Override
    public List<Judoka> findAll() {
        return judokaDAO.findAll();
    }

    @Override
    public Judoka findOne(int id) {
        return judokaDAO.findById(id).orElse(null);
    }

    @Override
    public Judoka save(Judoka judoka) {
        return judokaDAO.save(judoka);
    }
}
