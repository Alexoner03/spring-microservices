package com.aortiz.sponsorservice.service.contracts;

import com.aortiz.sponsorservice.entities.Sponsor;

import java.util.List;

public interface ISponsorService {
    List<Sponsor> findAll();
    Sponsor findOne(int id);
    Sponsor save(Sponsor medal);
    List<Sponsor> findByJudokaId(int id);
}
