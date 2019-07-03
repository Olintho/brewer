package br.com.orei.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.orei.brewer.model.Estado;

@Repository
public interface Estados extends JpaRepository<Estado, Long>{

	
	
}
