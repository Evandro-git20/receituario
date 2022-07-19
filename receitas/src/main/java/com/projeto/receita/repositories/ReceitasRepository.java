package com.projeto.receita.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.receita.entiteis.Receitas;

public interface ReceitasRepository extends JpaRepository<Receitas, Long> {

}
