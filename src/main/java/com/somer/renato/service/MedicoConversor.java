package com.somer.renato.service;
import java.time.LocalDate;
import javax.management.loading.PrivateClassLoader;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;
import com.somer.renato.datasource.model.Medico;
import com.somer.renato.exception.MedicoResourceException;
import com.somer.renato.resource.model.MedicoResource;


//responsavel por fazer as validações das requisições "ex: postman"
@Component
public class MedicoConversor {

	public static Medico conversor(MedicoResource medicoResource) 
		throws MedicoResourceException{					
			
			try {				
				Medico medico = new Medico();
				
				Long idPaciente = checarIdMedico(
						medicoResource.getIdPaciente());
				
				LocalDate idade = checarIdade(medicoResource.getIdade());
				medico.setId_paciente(idPaciente);
				medico.setIdade(idade);
				medico.setCodigoCrm(medicoResource.getCodigoRegistro());
				medico.setNome(medicoResource.getNome());
				return medico;
				
				
			} catch(Exception e) {
				throw new MedicoResourceException("Falha ao Converter o resource para entidade, resource: "+ medicoResource);
				
			}
		}
	
		private static Long checarIdMedico(String idPaciente) {
			return Long.parseLong(idPaciente);
	}
		
		private static LocalDate checarIdade(String idade) {
			return LocalDate.parse(idade);
		}
	
}
