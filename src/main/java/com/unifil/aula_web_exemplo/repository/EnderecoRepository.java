package com.unifil.aula_web_exemplo.repository;

import com.unifil.aula_web_exemplo.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

    public List<Endereco> findAll();

    @Query(value = "SELECT e FROM Endereco e WHERE e.cidade = :cidade")
    public Endereco findByCidade(@Param("cidade") String cidade);
}
