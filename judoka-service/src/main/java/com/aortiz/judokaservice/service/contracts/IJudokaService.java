package com.aortiz.judokaservice.service.contracts;

import com.aortiz.judokaservice.entities.locals.Judoka;

import java.util.List;

public interface IJudokaService {
    List<Judoka> findAll();
    Judoka findOne(int id);
    Judoka save(Judoka judoka);
}
