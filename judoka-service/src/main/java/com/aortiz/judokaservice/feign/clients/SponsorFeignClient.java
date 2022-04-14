package com.aortiz.judokaservice.feign.clients;

import com.aortiz.judokaservice.entities.externals.Sponsor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "sponsor-service", url = "${sponsor.service.url}")
public interface SponsorFeignClient {

    @GetMapping("/sponsors/judoka/{id}")
    public List<Sponsor> findByJudokaId(@PathVariable int id);
}
