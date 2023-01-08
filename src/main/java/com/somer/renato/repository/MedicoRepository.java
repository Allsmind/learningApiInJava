package com.somer.renato.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.somer.renato.datasource.model.Medico;

//metodos para o envio e busca para o banco de dados(model<>db)
//1° extenteder a jparepository onde "T" representa a entidade no caso Medico
//2°  o tipo do id da entidade no db no caso "Long"

public interface MedicoRepository 
		extends JpaRepository<Medico, Long>{

}
