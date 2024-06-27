package com.unifil.aula_web_exemplo.controller;

import com.unifil.aula_web_exemplo.FarmaciaService;
import com.unifil.aula_web_exemplo.model.Farmacia;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/farmacias")
public class FarmaciaController {

    private final FarmaciaService farmaciaService;

    public FarmaciaController(FarmaciaService farmaciaService) {
        this.farmaciaService = farmaciaService;
    }

    @GetMapping
    public List<Farmacia> getAllFarmacias() {
        return farmaciaService.findAll();
    }

    @PostMapping
    public Farmacia createFarmacia(@RequestBody Farmacia farmacia) {
        return farmaciaService.save(farmacia);
    }

    @DeleteMapping("/{id}")
    public void deleteFarmacia(@PathVariable Long id) {
        farmaciaService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Farmacia updateFarmacia(@PathVariable Long id, @RequestBody Farmacia farmacia) {
        return farmaciaService.update(id, farmacia);
    }
}
