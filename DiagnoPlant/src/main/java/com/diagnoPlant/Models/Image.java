package com.diagnoPlant.Models;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
    @Entity
public class Image implements Serializable{

		private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private String image;
    
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public Image(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}