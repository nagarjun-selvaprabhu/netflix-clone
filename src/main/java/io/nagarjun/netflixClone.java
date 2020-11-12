package io.nagarjun;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.nagarjun.repo.*;
import io.nagarjun.model.*;

@SpringBootApplication
@ComponentScan
public class netflixClone {
	private static final Logger logger = LoggerFactory.getLogger(netflixClone.class);
	
	public static void main(String[] args) {
		SpringApplication.run(netflixClone.class, args);
		logger.debug("INSIDE MAIN");
	}
	
	
	@Bean
	public CommandLineRunner specificationsDemo(MovieRepository movieRepository) {
		return args -> {

			movieRepository.saveAll(Arrays.asList(
					new Movie("Troy", "Drama", 7.2,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p1.PNG?raw=true"),
					new Movie("The Godfather", "Crime", 9.2,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p2.PNG?raw=true"),
					new Movie("Invictus", "Sport", 7.3,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p3.PNG?raw=true"),
					new Movie("Black Panther", "Action", 7.3,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p4.PNG?raw=true"),
					new Movie("Joker", "Drama", 8.9,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p5.PNG?raw=true"),
					new Movie("Iron Man", "Action", 8.9,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p6.PNG?raw=true"),
					new Movie("Luke cage", "Drama", 7.2,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/t1.PNG?raw=true"),
					new Movie("The Ranch", "Crime", 9.2,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/t2.PNG?raw=true"),
					new Movie("Step Up 2", "Sport", 7.3,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/t3.PNG?raw=true"),
					new Movie("Club of Ballad", "Action", 7.3,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/t4.PNG?raw=true"),
					new Movie("Kissing Booth", "Drama", 8.9,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/t5.PNG?raw=true"),
					new Movie("Night Shift", "Action", 8.9,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/t6.PNG?raw=true"),
					new Movie("Luke cage", "Drama", 7.2,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/r1.PNG?raw=true"),
					new Movie("The Ranch", "Crime", 9.2,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/r2.PNG?raw=true"),
					new Movie("Step Up 2", "Sport", 7.3,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/r3.PNG?raw=true"),
					new Movie("Club of Ballad", "Action", 7.3,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/r4.PNG?raw=true"),
					new Movie("Kissing Booth", "Drama", 8.9,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/r5.PNG?raw=true"),
					new Movie("Night Shift", "Action", 8.9,
							"https://github.com/carlosavilae/Netflix-Clone/blob/master/img/r6.PNG?raw=true")));
			
			logger.debug("INSIDE COMMANDLINERUNNER");
//			// search movies by `genre`
//			MovieSpecification msGenre = new MovieSpecification();
//			msGenre.add(new SearchCriteria("genre", "Action", SearchOperation.EQUAL));
//			List<Movie> msGenreList = movieRepository.findAll(msGenre);
//			msGenreList.forEach(System.out::println);
		};
	}
}
