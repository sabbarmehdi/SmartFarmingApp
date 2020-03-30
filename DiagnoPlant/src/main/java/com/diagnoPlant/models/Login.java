package com.diagnoPlant.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	 private Long id;
	 private String Username;
	 private String password;
	 
		
	protected Login() {}
	public Login(String Username, String password) {
		
		this.Username=Username;
		this.password=password;
		
	}
	
	 @Override
	  public String toString() {
	    return String.format(
	        "Login[username='%s', password='%s']",
	         Username, password);
	  }
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}
	

	

}
