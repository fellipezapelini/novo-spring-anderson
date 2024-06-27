package com.unifil.aula_web_exemplo;

import com.unifil.aula_web_exemplo.model.Farmacia;
import com.unifil.aula_web_exemplo.repository.FarmaciaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FarmaciaService {

    private final FarmaciaRepository farmaciaRepository;

    public FarmaciaService(FarmaciaRepository farmaciaRepository) {
        this.farmaciaRepository = farmaciaRepository;
    }

    public List<Farmacia> findAll() {
        return farmaciaRepository.findAll();
    }

    public Farmacia save(Farmacia farmacia) {
        return farmaciaRepository.save(farmacia);
    }

    public void deleteById(Long id) {
        farmaciaRepository.deleteById(id);
    }

    public Farmacia update(Long id, Farmacia farmacia) {
        if (farmaciaRepository.existsById(id)) {
            farmacia.setId(id);
            return farmaciaRepository.save(farmacia);
        } else {
            throw new IllegalArgumentException("Farmacia não encontrada com o ID fornecido: " + id);
        }
    }
}
