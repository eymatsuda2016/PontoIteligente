package com.eduardomatsuda.pontointeligente.api.services;

import java.util.Optional;

import com.eduardomatsuda.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {
	
	/**
	 * Persiste um funcionario na base de dados
	 * 
	 * @param funcionario
	 * @return Funcionario
	 */
	 Funcionario persistir (Funcionario funcionario);
	
	/**
	 * Busca e retorna um funcionario dado um CPF
	 * @param cpf
	 * @return Optional <Funcionario>
	 */
	 
	 Optional<Funcionario> buscarPorCpf(String cpf);
	 
	 /**
	  * Busca e retorna um funcionario dado um email
	  * @param email
	  * @return Optional<Funcionario>
	  */
	 
	 Optional<Funcionario> buscarPorEmail(String email);
	 
	 /**
	  * Busca e retorna um Funcionario por ID
	  * @param id
	  * @return Optional<Fncionario>
	  */
	   Optional<Funcionario> buscarPorId(Long id);
	

}
