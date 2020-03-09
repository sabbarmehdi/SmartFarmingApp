package net.guides.springboot2.springboot2jpacrudexample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "expert")
public class Expert {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@NotBlank(message = "First name is required")
    private String firstName;
	
	@NotBlank(message = "Last name is required")
    private String lastName;
 
    public Expert() {
  
    }
 
 
 
    public Expert(Long id, @NotBlank(message = "First name is required") String firstName,
			@NotBlank(message = "Last name is required") String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}



	public Expert(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
        public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
 
    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
  

    @Override
    public String toString() {
        return "Experte [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
 
}