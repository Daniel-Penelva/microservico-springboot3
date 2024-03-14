package com.microservice.usuario.feignclients;

import com.microservice.usuario.models.Moto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "moto-service", url = "http://localhost:8003")
public interface MotoFeignClient {

    @PostMapping("/api/moto/save")
    public Moto save(@RequestBody Moto moto);

    @GetMapping("/api/moto/searchUserId/{usuarioId}")
    public List<Moto> getMotos(@PathVariable int usuarioId);
}
