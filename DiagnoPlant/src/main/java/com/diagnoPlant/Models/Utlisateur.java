package com.diagnoPlant.Models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
    @Entity
public class Utlisateur implements Serializable{
	@Id
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	public Utlisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utlisateur(Long id, String nom, String prenom, String email) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
   
	
}