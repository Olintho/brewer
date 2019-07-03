package br.com.orei.brewer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.orei.brewer.model.Estilo;
import br.com.orei.brewer.repository.helper.estilo.EstilosQueries;

@Repository
public interface Estilos extends JpaRepository<Estilo, Long>, EstilosQueries{

	public Optional<Estilo> findByNomeIgnoreCase(String nome);

	
}
