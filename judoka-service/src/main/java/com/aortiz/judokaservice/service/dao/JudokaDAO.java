package com.aortiz.judokaservice.service.dao;

import com.aortiz.judokaservice.entities.locals.Judoka;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JudokaDAO extends JpaRepository<Judoka, Integer> {
}
