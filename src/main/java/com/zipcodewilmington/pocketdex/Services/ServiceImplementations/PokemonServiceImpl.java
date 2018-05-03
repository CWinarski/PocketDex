package com.zipcodewilmington.pocketdex.Services.ServiceImplementations;

import com.zipcodewilmington.pocketdex.Models.Pokemon;
import com.zipcodewilmington.pocketdex.Repositories.PokemonRepository;
import com.zipcodewilmington.pocketdex.Services.ServiceInterfaces.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpStatus.OK;

@Service
public class PokemonServiceImpl implements PokemonService {

    private PokemonRepository pokemonRepository;

    @Autowired
    public PokemonServiceImpl(PokemonRepository pokemonRepository){
        this.pokemonRepository = pokemonRepository;
    }
//
//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder){
//        return builder.build();
//    }

    public ResponseEntity<Pokemon> getPokemonByName(String name) {
        Pokemon pokemon = pokemonRepository.findPokemonByName(name);
        return new ResponseEntity<>(pokemon, OK);
    }
}
