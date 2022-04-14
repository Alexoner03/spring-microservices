package com.aortiz.medalservice.controllers;

import com.aortiz.medalservice.entities.Medal;
import com.aortiz.medalservice.service.implementations.MedalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medals")
public class MedalController {

    private final MedalService medalService;

    public MedalController(MedalService medalService) {
        this.medalService = medalService;
    }

    @GetMapping
    public ResponseEntity<List<Medal>> findAll() {
        return ResponseEntity.ok(this.medalService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medal> findOne(@PathVariable int id) {
        Medal medal = this.medalService.findOne(id);
        if(medal == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(medal);
    }

    @GetMapping("/judoka/{id}")
    public ResponseEntity<List<Medal>> findByJudokaId(@PathVariable int id) {
        return ResponseEntity.ok(this.medalService.findByJudokaId(id));
    }

    @PostMapping()
    public ResponseEntity<Medal> save(@RequestBody Medal medal) {
        return ResponseEntity.ok(this.medalService.save(medal));
    }

}
