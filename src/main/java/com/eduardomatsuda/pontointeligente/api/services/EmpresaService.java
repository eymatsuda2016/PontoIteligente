package com.eduardomatsuda.pontointeligente.api.services;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.eduardomatsuda.pontointeligente.api.entities.Empresa;

@Component
public interface EmpresaService {
	
	/**
	 * Retorna uma empresa dado um CNPJ.
	 * 
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/**
	 * Cadastra uma nova empresa na base de dados.
	 * 
	 * @param empresa
	 * @return Empresa
	 */
	Empresa persistir(Empresa empresa);
	
}
