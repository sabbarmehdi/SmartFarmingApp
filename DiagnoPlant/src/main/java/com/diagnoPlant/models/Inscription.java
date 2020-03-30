package com.diagnoPlant.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author hp
 * 
 *
 */
@Entity
public class Inscription {
	//Declaration of variables
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Long id;
	private String Username;
	private String Email;
	private String Fonction;
	private String Password;
	private String Confirm_Password;
		
	protected Inscription() {}
	public Inscription(String Username,String Email,String Fonction, String Password, String Confirm_Password  ) {
		// TODO Auto-generated constructor stub
		this.Username=Username;
		this.Email=Email;
		this.Fonction=Fonction;
		this.Password=Password;
		this.Confirm_Password=Confirm_Password;
		
				
	}

	/**
	 * @param args
	 */
	@Override
	  public String toString() {
	    return String.format(
	        "User[id=%d, Username='%s', Email='%s', Fonction='%s', Password='%s',Confirm_Password='%s']",
	        id,Username,Email,Fonction,Password,Confirm_Password );
	    
}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public  void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return Username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		Username = username;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**
	 * @return the fonction
	 */
	public String getFonction() {
		return Fonction;
	}
	/**
	 * @param fonction the fonction to set
	 */
	public void setFonction(String fonction) {
		Fonction = fonction;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}
	/**
	 * @return the confirm_Password
	 */
	public String getConfirm_Password() {
		return Confirm_Password;
	}
	/**
	 * @param confirm_Password the confirm_Password to set
	 */
	public void setConfirm_Password(String confirm_Password) {
		Confirm_Password = confirm_Password;
	}
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public void setConfirmationToken(String string) {
		// TODO Auto-generated method stub
		
	}
	public String getConfirmationToken() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

