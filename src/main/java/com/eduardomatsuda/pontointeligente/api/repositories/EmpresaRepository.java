package com.eduardomatsuda.pontointeligente.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardomatsuda.pontointeligente.api.entities.Empresa;

import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	
	@Transactional (readOnly =true)
	Empresa findByCnpj(String cnpj);

}
