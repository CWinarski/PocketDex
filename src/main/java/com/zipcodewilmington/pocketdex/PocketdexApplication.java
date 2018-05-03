package com.zipcodewilmington.pocketdex;

import com.zipcodewilmington.pocketdex.Models.Pokemon;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PocketdexApplication {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(PocketdexApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PocketdexApplication.class, args);
	}

	@Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
	    return builder.build();
    }

	@Bean
    public CommandLineRunner run(RestTemplate restTemplate){
	    return args -> {
	        Pokemon pokemon = restTemplate.getForObject("http://pokeapi.co/api/v2/pokemon/charmander", Pokemon.class);
	        log.info(pokemon.toString());
        };
    }
}
