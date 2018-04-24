package com.zipcodewilmington.pocketdex.Services.ServiceImplementations;

import com.zipcodewilmington.pocketdex.Models.Pokemon;
import com.zipcodewilmington.pocketdex.Services.ServiceInterfaces.PokemonServiceInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PokemonServiceImpl implements PokemonServiceInterface {

    public ResponseEntity<Pokemon> getPokemonByName(String name) {
        return null;
    }
}
