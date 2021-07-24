package com.eventoSpring.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoSpring.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {

	Evento findByCodigo(long codigo);
}
