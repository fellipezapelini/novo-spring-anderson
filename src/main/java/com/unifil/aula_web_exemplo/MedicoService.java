package com.unifil.aula_web_exemplo;

import com.unifil.aula_web_exemplo.model.Medico;
import com.unifil.aula_web_exemplo.repository.MedicoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicoService {

    private final MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public List<Medico> findAll() {
        return medicoRepository.findAll();
    }

    public Medico save(Medico medico) {
        return medicoRepository.save(medico);
    }

    public void deleteById(Long id) {
        medicoRepository.deleteById(id);
    }

    public Medico update(Long id, Medico medico) {
        if (medicoRepository.existsById(id)) {
            medico.setId(id);
            return medicoRepository.save(medico);
        } else {
            throw new IllegalArgumentException("Medico não encontrada com o ID fornecido: " + id);
        }
    }
}
