package com.unifil.aula_web_exemplo;

import com.unifil.aula_web_exemplo.model.Receita;
import com.unifil.aula_web_exemplo.repository.ReceitaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReceitaService {

    private final ReceitaRepository receitaRepository;

    public ReceitaService(ReceitaRepository receitaRepository) {
        this.receitaRepository = receitaRepository;
    }

    public List<Receita> findAll() {
        return receitaRepository.findAll();
    }

    public Receita save(Receita receita) {
        return receitaRepository.save(receita);
    }

    public void deleteById(Long id) {
        receitaRepository.deleteById(id);
    }

    public Receita update(Long id, Receita receita) {
        if (receitaRepository.existsById(id)) {
            receita.setId(id);
            return receitaRepository.save(receita);
        } else {
            throw new IllegalArgumentException("Receita não encontrada com o ID fornecido: " + id);
        }
    }
}
