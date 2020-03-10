package com.project.DiagnoPlant;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Image {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private Date dateDeCreation;
	
	protected Image() {
		
	}
	
	public Image(Date dateDeCreaton) {
		this.setDateDeCreation(dateDeCreaton);
	}
	
	public void prendre() {
		
	}
	
	public void upload(){
		
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the dateDeCreation
	 */
	public Date getDateDeCreation() {
		return dateDeCreation;
	}

	/**
	 * @param dateDeCreation the dateDeCreation to set
	 */
	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	

}
