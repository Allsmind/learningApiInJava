package com.somer.renato.datasource.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//responsavel por criar o banco de dados a parti dos paramentros

@Entity
@Table(name = "medico")
public class Medico implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6238216594965222229L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	private String nome;
	private LocalDate idade;
	
	@Column(name = "codigo_crm")
	private String codigoCrm;
	
	@Column(name = "id_paciente")
	private Long idPaciente;
	
	
	
	
	public Medico(String nome, LocalDate idade, String codigoCrm, Long idPaciente) {
		
		this.nome = nome;
		this.idade = idade;
		this.codigoCrm = codigoCrm;
		this.idPaciente = idPaciente;
	}
	
	
	
	public Medico() {
		
	}
	
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getIdade() {
		return idade;
	}
	public void setIdade(LocalDate idade) {
		this.idade = idade;
	}
	public String getCodigoCrm() {
		return codigoCrm;
	}
	public void setCodigoCrm(String codigoCrm) {
		this.codigoCrm = codigoCrm;
	}
	public Long getId_paciente() {
		return idPaciente;
	}
	public void setId_paciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
