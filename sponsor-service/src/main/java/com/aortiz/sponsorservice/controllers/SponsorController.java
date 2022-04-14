package com.aortiz.sponsorservice.controllers;

import com.aortiz.sponsorservice.entities.Sponsor;
import com.aortiz.sponsorservice.service.implementations.SponsorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sponsors")
public class SponsorController {
    private final SponsorService sponsorService;

    public SponsorController(SponsorService sponsorService) {
        this.sponsorService = sponsorService;
    }

    @GetMapping
    public ResponseEntity<List<Sponsor>> findAll() {
        return ResponseEntity.ok(this.sponsorService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sponsor> findOne(@PathVariable int id) {
        Sponsor sponsor = this.sponsorService.findOne(id);
        if(sponsor == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(sponsor);
    }

    @GetMapping("/judoka/{id}")
    public ResponseEntity<List<Sponsor>> findByJudokaId(@PathVariable int id) {
        return ResponseEntity.ok(this.sponsorService.findByJudokaId(id));
    }

    @PostMapping()
    public ResponseEntity<Sponsor> save(@RequestBody Sponsor sponsor) {
        return ResponseEntity.ok(this.sponsorService.save(sponsor));
    }
}
