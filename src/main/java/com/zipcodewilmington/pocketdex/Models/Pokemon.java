package com.zipcodewilmington.pocketdex.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {

    private Integer id;
    private String name;
    private Integer height;
    private Integer weight;
    private String[] abilities;
    private String[] types;

    public Pokemon(Integer id, String name, Integer height, Integer weight, String[] abilities, String[] types) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.abilities = abilities;
        this.types = types;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String[] getAbilities() {
        return abilities;
    }

    public void setAbilities(String[] abilities) {
        this.abilities = abilities;
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }
}
