package com.example.ExpertImage.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

     @Entity
public class MaladiePlante implements Serializable {
    	
      @Id
      @GeneratedValue
    private Long id;
    private String nomMaladie;
    private String symptomes;
    private String causes;
    private String traitement;
    private String actionsPreventives;
    	
	public Long getId() {
			return id;
		}
    public void setId(Long id) {
			this.id = id;
		}
	public String getNomMaladie() {
			return nomMaladie;
		}
	public void setNomMaladie(String nomMaladie) {
			this.nomMaladie = nomMaladie;
		}
	public String getSymptomes() {
			return symptomes;
		}
	public void setSymptomes(String symptomes) {
			this.symptomes = symptomes;
		}
	public String getCauses() {
			return causes;
		}
	public void setCauses(String causes) {
			this.causes = causes;
		}
	public String getTraitement() {
			return traitement;
		}
	public void setTraitement(String traitement) {
			this.traitement = traitement;
		}
	public String getActionsPreventives() {
			return actionsPreventives;
		}
	public void setActionsPreventives(String actionsPreventives) {
			this.actionsPreventives = actionsPreventives;
		}
	public MaladiePlante(Long id, String nomMaladie, String symptomes, String causes, String traitement,
				String actionsPreventives) {
			super();
			this.id = id;
			this.nomMaladie = nomMaladie;
			this.symptomes = symptomes;
			this.causes = causes;
			this.traitement = traitement;
			this.actionsPreventives = actionsPreventives;
		}
	public MaladiePlante() {
			super();
			// TODO Auto-generated constructor stub
		}
	

}
