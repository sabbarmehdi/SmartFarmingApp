package com.diagnoPlant.Models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Expert implements Serializable{
	@Id
	@GeneratedValue
	private Long idExpert;
	private String firstName;
	private String lastName;
	/**
	 * 
	 */
	public Expert() {
		super();
	}
	/**
	 * @param idExpert
	 * @param firstName
	 * @param lastName
	 */
	public Expert(Long idExpert, String firstName, String lastName) {
		super();
		this.idExpert = idExpert;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/**
	 * @return the idExpert
	 */
	public Long getIdExpert() {
		return idExpert;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param idExpert the idExpert to set
	 */
	public void setIdExpert(Long idExpert) {
		this.idExpert = idExpert;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Expert [idExpert=" + idExpert + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	

}
