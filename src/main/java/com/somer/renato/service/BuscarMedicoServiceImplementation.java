package com.somer.renato.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.somer.renato.datasource.model.Medico;
import com.somer.renato.exception.MedicoNotFoundException;
import com.somer.renato.repository.MedicoRepository;

@Service
public class BuscarMedicoServiceImplementation {

	@Autowired
	private MedicoRepository medicoRepository;
	
	
	public List<Medico> buscarTodosMedicos() {
		List<Medico> listMedico =  medicoRepository.findAll();
				return listMedico;						
	}
	
	
	public Medico buscarPorId(Long id) 
			throws MedicoNotFoundException {
		Optional<Medico> optionalMedico = getOptional(id);
		Medico medico = null;
		
		if(!optionalMedico.isPresent()) {
			throw new MedicoNotFoundException("Medico não encontrado atravez do Id: "+ id);
		}else {
			medico = optionalMedico.get();
		}
		return medico;
	}


	private Optional<Medico> getOptional(Long id) {
		Optional<Medico> optionalMedico = medicoRepository.findById(id);
		return optionalMedico;
	}
	
	public void deletarPorId(Long id) throws MedicoNotFoundException {
		
		Optional<Medico> optionalMedico = getOptional(id);			
		if(!optionalMedico.isPresent()) {
			throw new MedicoNotFoundException("Medico não encontrado atravez do Id: "+ id);
		}else {		
		medicoRepository.delete(optionalMedico.get());
		
		}
		
	}
}
