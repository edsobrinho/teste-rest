package br.com.dbserve.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dbserve.teste.model.Classificacao;

@Repository
public interface ClassificacaoRepository extends JpaRepository<Classificacao, Long> {

}