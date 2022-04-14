package com.aortiz.sponsorservice.service.implementations;

import com.aortiz.sponsorservice.entities.Sponsor;
import com.aortiz.sponsorservice.service.contracts.ISponsorService;
import com.aortiz.sponsorservice.service.dao.SponsorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SponsorService implements ISponsorService {
    private final SponsorDAO sponsorDAO;

    @Autowired
    public SponsorService(SponsorDAO sponsorDAO) {
        this.sponsorDAO = sponsorDAO;
    }

    @Override
    public List<Sponsor> findAll() {
        return this.sponsorDAO.findAll();
    }

    @Override
    public Sponsor findOne(int id) {
        return this.sponsorDAO.findById(id).orElse(null);
    }

    @Override
    public Sponsor save(Sponsor sponsor) {
        return this.sponsorDAO.save(sponsor);
    }

    @Override
    public List<Sponsor> findByJudokaId(int id) {
        return this.sponsorDAO.findByJudokaId(id);
    }
}
