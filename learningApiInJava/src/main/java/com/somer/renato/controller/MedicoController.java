package com.somer.renato.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.JpaSort.Path;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.somer.renato.datasource.model.Medico;
import com.somer.renato.exception.MedicoNotFoundException;
import com.somer.renato.repository.MedicoRepository;
import com.somer.renato.resource.model.MedicoResource;
import com.somer.renato.service.BuscarMedicoServiceImplementation;
import com.somer.renato.service.CadastroMedico;

// responsavel por receber as requisições e repassar para camada de serviço 


@RestController
@RequestMapping(value = "/api")
public class MedicoController {
	
		
	
	@Autowired
	private BuscarMedicoServiceImplementation serviceBuscar;
	
	@Autowired
	private CadastroMedico serviceCadastro;
	
	
	@GetMapping(path = "/medico")
	public List<Medico> buscarMedico() {
		return serviceBuscar.buscarTodosMedicos();
	}
	
	@GetMapping(path = "/medico/id/{id}")
	public Medico buscarMedicoPorId(
			@PathVariable(name = "id", required = true) Long id) 
					throws MedicoNotFoundException {
		return serviceBuscar.buscarPorId(id);
	}
	
	@PostMapping(path = "/medico/save")
	public void salvarMedico(
			@RequestBody MedicoResource medico ) {
		serviceCadastro.cadastro(medico);			
	}
	
	@DeleteMapping(path = "/medico/delete/{id}")
	public void deletarMedico(
			@PathVariable(name = "id", required = true) Long id) throws MedicoNotFoundException {
		serviceBuscar.deletarPorId(id);
	}
	
}
