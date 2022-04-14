package com.aortiz.sponsorservice.service.dao;

import com.aortiz.sponsorservice.entities.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SponsorDAO extends JpaRepository<Sponsor, Integer> {
    List<Sponsor> findByJudokaId(int id);
}
