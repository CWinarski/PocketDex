package com.zipcodewilmington.pocketdex.Services.ServiceInterfaces;

import com.zipcodewilmington.pocketdex.Models.Pokemon;
import org.springframework.http.ResponseEntity;

public interface PokemonService {
    ResponseEntity<Pokemon> getPokemonByName(String name);
}
