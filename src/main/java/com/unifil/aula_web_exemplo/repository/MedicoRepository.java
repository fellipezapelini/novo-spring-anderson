package com.unifil.aula_web_exemplo.repository;

import com.unifil.aula_web_exemplo.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {



    Medico findByNome(String nome);


    List<Medico> findByEspecialidade(String especialidade);


    boolean existsByNome(String nome);


    long countByEspecialidade(String especialidade);


    void deleteByEspecialidade(String especialidade);


}
