package com.somer.renato.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.somer.renato.datasource.model.Medico;
import com.somer.renato.exception.MedicoResourceException;
import com.somer.renato.repository.MedicoRepository;
import com.somer.renato.resource.model.MedicoResource;

@Service
public class CadastroMedico {
	//camada de serviço responsavel pela regra de negocio, fica entre o controller e o repositorio 
	// @autowired é a anotação mais utiliza com relação a injeção de dependências, no caso injetando a classe
	//MedicoRepository dentro da classe CadastroMedico
	//trazendo as funcoes atravez do jparepository
	
		
	@Autowired
	private MedicoRepository medicoRepository;
	
	@Autowired
	private MedicoConversor service;	
	
	public void cadastro(MedicoResource medicoResource) {
		
		
		Medico medico = null;
		try {
			medico = service.conversor(medicoResource);
			medicoRepository.saveAndFlush(medico);
		} catch (MedicoResourceException e) {			
			e.printStackTrace();
		}	
		
	}
	
}
