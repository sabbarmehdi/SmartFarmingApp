package com.diagnoPlant.Models;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
    @Entity
public class Plante implements Serializable {
		private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String type;
	public Plante() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plante(Long id, String nom, String type) {
		super();
		this.id = id;
		this.nom = nom;
		this.type = type;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    
	
}