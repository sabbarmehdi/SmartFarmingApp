package com.example.ExpertImage.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class Expert implements Serializable {
	  @Id
	private Long id;
	  @Column(name="Nom",length=30)
	private String nom;
	  @Column(name="Prénom",length=30)
	private String prenom;
	  @Column(name="Fonction",length=30)
	private String fonction;
	
	public Expert() {
		super();
	}
	public Expert(Long id, String nom, String prenom, String fonction) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
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
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	

}
