package com.eventoSpring.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoSpring.models.Convidado;
import com.eventoSpring.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{

	Iterable<Convidado> findByEvento(Evento evento); // para buscar os eventos e selecionar um por vez
	Convidado findByRg(String rg);
}
