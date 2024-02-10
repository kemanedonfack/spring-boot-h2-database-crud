package com.bezkoder.spring.jpa.h2;

import com.bezkoder.spring.jpa.h2.model.Tutorial;
import com.bezkoder.spring.jpa.h2.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaH2Application implements CommandLineRunner {

	@Autowired
	public TutorialRepository tutorialRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Tutorial tutorial = new Tutorial("kind ", "kind description 1", false);
		Tutorial tutorial1 = new Tutorial("kind 1", "kind description 2", false);
		Tutorial tutorial2 = new Tutorial("kind 2", "kind description 3", false);

		tutorialRepository.save(tutorial);
		tutorialRepository.save(tutorial1);
		tutorialRepository.save(tutorial2);

	}
}
