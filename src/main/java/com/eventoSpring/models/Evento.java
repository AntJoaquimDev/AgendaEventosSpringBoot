package com.eventoSpring.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Evento implements Serializable{

	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo; 
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String local;
	
	@Column(nullable = false)
	private String data;
	
	@Column(nullable = false)
	private String horario;
	
	@OneToMany
	private List<Convidado> convidadoEventos;
	
	
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
	
}
