package co.simplon.avent.model;

import java.util.List;

// Le JPA :  Java Persistence API
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

// Définir à notre bdd que User est une entité
@Entity
public class User {

	// Génère automatiquement la clé primaire
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String firstName;
	private String lastName;
	private String email;

	// Eviter les doublons
	@JsonIgnore
	// mappedBy spécifie qui fait le lien, en l'occurence user
	// Un utilisateur à plusieurs links mais un link à un seul utilisateur
	@OneToMany(mappedBy = "user")
	private List<Link> links;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastname) {
		this.lastName = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Link> getLink() {
		return links;
	}

	public void setLink(List<Link> links) {
		this.links = links;
	}

}
