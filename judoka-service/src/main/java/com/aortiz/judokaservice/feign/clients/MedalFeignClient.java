package com.aortiz.judokaservice.feign.clients;

import com.aortiz.judokaservice.entities.externals.Medal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "medal-service", url = "http://localhost:8002")
public interface MedalFeignClient {

    @GetMapping("/medals/judoka/{id}")
    public List<Medal> findByJudokaId(@PathVariable int id);
}
