package com.eduardomatsuda.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardomatsuda.pontointeligente.api.entities.Empresa;
import com.eduardomatsuda.pontointeligente.api.repositories.EmpresaRepository;


@Service
public class EmpresaServiceImpl {
	
	private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImpl.class);
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	
	public Optional <Empresa> buscarPorCnpj(String cnpj){
		log.info("Buscando uma empresa para  CNPJ{}", cnpj);
		return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
	}
	

	public Empresa persistir(Empresa empresa) {
		log.info("Persistindo empresa: {}",empresa);
		return this.empresaRepository.save(empresa);
	}

}
