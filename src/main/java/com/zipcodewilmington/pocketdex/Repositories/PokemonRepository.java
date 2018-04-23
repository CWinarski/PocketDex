package com.zipcodewilmington.pocketdex.Repositories;

import com.zipcodewilmington.pocketdex.Models.Pokemon;
import org.springframework.data.repository.CrudRepository;

public interface PokemonRepository extends CrudRepository<Pokemon, Long>{

}
