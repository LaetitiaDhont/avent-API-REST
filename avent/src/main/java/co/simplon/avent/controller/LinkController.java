package co.simplon.avent.controller;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.avent.model.Link;
import co.simplon.avent.repository.LinkRepository;

@CrossOrigin("http://localhost:4200")
@RestController
// Indique le chemin

@RequestMapping("/api/link")

public class LinkController {

	@Autowired
	private LinkRepository linkRepo;

	// Injection de dépendances
	public LinkController(LinkRepository linkRepo) {
		this.linkRepo = linkRepo;
	}

	@GetMapping
	public List<Link> getDailyLinks() {
		// Date du jour avec la méthode now de la classe LocalDate
		LocalDate today = LocalDate.now();
		return linkRepo.findByDate(today);
	}

	// Lister les liens

}
