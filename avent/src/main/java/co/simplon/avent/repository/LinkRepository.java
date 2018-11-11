package co.simplon.avent.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.avent.model.Link;
import co.simplon.avent.model.User;

// Généricité  
@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {

	// Select dans la BDD avec une date donnée
	List<Link> findByDate(LocalDate date);

}
