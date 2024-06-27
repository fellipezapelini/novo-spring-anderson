package com.unifil.aula_web_exemplo.repository;

import com.unifil.aula_web_exemplo.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
}
