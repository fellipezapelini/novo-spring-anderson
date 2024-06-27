package com.unifil.aula_web_exemplo.controller;

import com.unifil.aula_web_exemplo.ReceitaService;
import com.unifil.aula_web_exemplo.model.Receita;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/receitas")
public class ReceitaController {

    private final ReceitaService receitaService;

    public ReceitaController(ReceitaService receitaService) {
        this.receitaService = receitaService;
    }

    @GetMapping
    public List<Receita> getAllReceitas() {
        return receitaService.findAll();
    }

    @PostMapping
    public Receita createReceita(@RequestBody Receita receita) {
        return receitaService.save(receita);
    }

    @DeleteMapping("/{id}")
    public void deleteReceita(@PathVariable Long id) {
        receitaService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Receita updateReceita(@PathVariable Long id, @RequestBody Receita receita) {
        return receitaService.update(id, receita);
    }
}



