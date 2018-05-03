package com.zipcodewilmington.pocketdex.Controllers;

import com.zipcodewilmington.pocketdex.Models.Pokemon;
import com.zipcodewilmington.pocketdex.Services.ServiceInterfaces.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class PokemonController {
    private PokemonService pokemonService;

    @Autowired
    public PokemonController(PokemonService pokemonService){
        this.pokemonService = pokemonService;
    }

    @RequestMapping(value = "/pokemon/{name}", method = GET)
    public ResponseEntity<Pokemon> getPokemonByName(@PathVariable("name") String name){
        return pokemonService.getPokemonByName(name);
    }


}
