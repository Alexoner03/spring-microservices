package com.aortiz.judokaservice.controllers;

import com.aortiz.judokaservice.entities.externals.Medal;
import com.aortiz.judokaservice.entities.externals.Sponsor;
import com.aortiz.judokaservice.entities.locals.Judoka;
import com.aortiz.judokaservice.feign.clients.MedalFeignClient;
import com.aortiz.judokaservice.feign.clients.SponsorFeignClient;
import com.aortiz.judokaservice.service.implementations.JudokaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/judokas")
public class JudokaController {

    private final JudokaService judokaService;
    private final MedalFeignClient medalFeignClient;
    private final SponsorFeignClient sponsorFeignClient;

    @Autowired
    public JudokaController(JudokaService judokaService, MedalFeignClient medalFeignClient, SponsorFeignClient sponsorFeignClient) {
        this.judokaService = judokaService;
        this.medalFeignClient = medalFeignClient;
        this.sponsorFeignClient = sponsorFeignClient;
    }

    @GetMapping
    public ResponseEntity<List<Judoka>> findAll() {
        return ResponseEntity.ok(this.judokaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> findOne(@PathVariable int id){

        Map<String, Object> response = new HashMap<>();

        Judoka judoka = this.judokaService.findOne(id);

        if(judoka == null){
            return ResponseEntity.notFound().build();
        }

        List<Medal> medals = medalFeignClient.findByJudokaId(id);
        List<Sponsor> sponsors = sponsorFeignClient.findByJudokaId(id);

        response.put("judoka", judoka);
        response.put("medals", medals);
        response.put("sponsors", sponsors);

        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Judoka> save(@RequestBody Judoka judoka){
        return ResponseEntity.ok(this.judokaService.save(judoka));
    }
}
