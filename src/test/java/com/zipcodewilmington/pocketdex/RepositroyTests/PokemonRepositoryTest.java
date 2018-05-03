package com.zipcodewilmington.pocketdex.RepositroyTests;

import com.zipcodewilmington.pocketdex.Models.Pokemon;
import com.zipcodewilmington.pocketdex.Repositories.PokemonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class PokemonRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private PokemonRepository pokemonRepository;

    @Test
    public void findPokemonByNameTest(){
        //Given
        Pokemon mockPokemon = new Pokemon();
        String pokemonName = "charmander";
        //When
        //Then
    }


}
