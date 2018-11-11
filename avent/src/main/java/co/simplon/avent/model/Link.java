package co.simplon.avent.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Link {

	// Génère automatiquement la clé primaire
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String url;
	// Spring va remplacer les énumérations par des chiffres (1 --> DATA 2 --> WEB)
	@Enumerated(EnumType.STRING)
	private Topic topic;
	// Format année/mois/jour sans l'heure
	private LocalDate date;
	
	// Un utilisateur a plusieurs links mais un link a un seul utilisateur
	// Ne peut être mappé car il y a plusieurs links
	// Clé étrangère 
	// JPA recupère l'objet complet en faisant les requêtes automatiquement
	@ManyToOne
	private User user;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
