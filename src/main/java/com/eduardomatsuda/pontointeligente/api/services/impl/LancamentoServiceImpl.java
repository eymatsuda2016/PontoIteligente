package com.eduardomatsuda.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.eduardomatsuda.pontointeligente.api.entities.Lancamento;
import com.eduardomatsuda.pontointeligente.api.repositories.LancamentoRepository;
import com.eduardomatsuda.pontointeligente.api.services.LancamentoService;

@Service 
public abstract class LancamentoServiceImpl implements LancamentoService{
	
	private static final Logger log = LoggerFactory.getLogger(Lancamento.class);
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest){
		log.info("Buscando Lancamentos para o funcionario ID{}", funcionarioId);
		return this.lancamentoRepository.findByFuncionarioId(funcionarioId, pageRequest);
	}
	
	public Optional <Lancamento>buscarPorId(Long id){
		log.info("Buscando lancamento por ID{}", id);
		return this.lancamentoRepository.findById(id);
	}
	
	public Lancamento persistir(Lancamento lancamento) {
		log.info("Persistindo o lançamento: {}", lancamento);
		return this.lancamentoRepository.save(lancamento);
	}
	
	public void remover(Long id) {
		log.info("Removendo o lançamento ID {}", id);
		this.lancamentoRepository.deleteById(id);
	}
	

}
