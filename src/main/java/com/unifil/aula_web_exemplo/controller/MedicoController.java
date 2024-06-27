package com.unifil.aula_web_exemplo.controller;

import com.unifil.aula_web_exemplo.MedicoService;
import com.unifil.aula_web_exemplo.model.Medico;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {

    private final MedicoService medicoService;

    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @GetMapping
    public List<Medico> getAllMedicos() {
        return medicoService.findAll();
    }

    @PostMapping
    public Medico createMedico(@RequestBody Medico medico) {
        return medicoService.save(medico);
    }

    @DeleteMapping("/{id}")
    public void deleteMedico(@PathVariable Long id) {
        medicoService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Medico updateMedico(@PathVariable Long id, @RequestBody Medico medico) {
        return medicoService.update(id, medico);
    }
}

