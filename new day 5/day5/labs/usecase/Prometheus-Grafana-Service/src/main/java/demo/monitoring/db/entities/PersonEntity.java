package demo.monitoring.db.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import demo.monitoring.web.models.Person;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <pre>
 *  	Entity class representing PERSON table in Database
 *  For the sake of simplicity all fields are kept same as {@link Person} object to be used as DTO
 * </pre>
  */
@Data
@Entity
@Table(name = "PERSON")
@NoArgsConstructor
public class PersonEntity implements Serializable{
	private static final long serialVersionUID = -8003246612943943723L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int personId;
	
	private String firstName;
	private String lastName;
	private String email;
	
	public PersonEntity( String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public PersonEntity(int personId, String firstName, String lastName, String email) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
