package com.somer.renato.resource.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicoResource {

	@JsonProperty("nome_medico")
	private String nome;
	
	@JsonProperty("idade")
	private String idade;
	
	@JsonProperty
	private String codigoRegistro;
	
	@JsonProperty("id_paciente")
	private String idPaciente;
	
	
	public MedicoResource(String nome, String idPaciente) {
		this.nome = nome;
		this.idPaciente = idPaciente;
	}
		
	
	public String getIdade() {
		return idade;
	}


	public void setIdade(String idade) {
		this.idade = idade;
	}


	public String getCodigoRegistro() {
		return codigoRegistro;
	}


	public void setCodigoRegistro(String codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}


	@Override
	public String toString() {
		return "MedicoResource [nome=" + nome + ", idade=" + idade + ", codigoRegistro=" + codigoRegistro
				+ ", idPaciente=" + idPaciente + "]";
	}
	
	
	
	
	
}
