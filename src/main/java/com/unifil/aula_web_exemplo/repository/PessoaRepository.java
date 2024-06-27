package com.unifil.aula_web_exemplo.repository;

import com.unifil.aula_web_exemplo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    Pessoa findByNome(String nome);

    boolean existsByNome(String nome);


}
