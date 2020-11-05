package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
// FAZ A CONDUÇÃO DOS DADOS AO BANCO, SERVE PARA PERSISTIR OS DADOS NO BANCO, OU SEJA, INSERIR
public interface ManutencaoRepository extends JpaRepository<ManutencaoTable, Long> {

	List<ManutencaoTable> findByNome(String nome);

	Optional<ManutencaoTable> findByNomeAndCategoria(String nome, String categoria);

	void deleteByNome(String nome);
}