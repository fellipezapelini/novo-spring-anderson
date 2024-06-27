package com.unifil.aula_web_exemplo.repository;

import com.unifil.aula_web_exemplo.model.Farmacia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmaciaRepository extends JpaRepository<Farmacia, Long> {
}
