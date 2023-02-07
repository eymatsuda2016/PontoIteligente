package com.eduardomatsuda.pontointeligente.api.repositories;


import java.util.List;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.eduardomatsuda.pontointeligente.api.entities.Lancamento;


@Transactional
@NamedQueries({ 
	@NamedQuery(name= "LancamentoRepository.findByFuncionarioId",
			query = "SELECT lanc From Lancamento lanc WHERE lanc.funcionarioId="
					+ ":funcionarioId") })
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

	List<Lancamento> findByFuncionarioId(@Param ("funcionarioId")Long funcionarioId);
	Page<Lancamento> findByFuncionarioId(@Param ("funcionarioId")Long funcionarioId, PageRequest pageRequest);
	
}
