package com.zipcodewilmington.pocketdex.Models;

import java.util.List;

public class Pokemon {

    private Integer id;
    private String name;
    private Integer height;
    private Integer weight;
    private List abilities;

    public Pokemon(Integer id, String name, Integer height, Integer weight, List abilities) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.abilities = abilities;
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

    public List getAbilities() {
        return abilities;
    }

    public void setAbilities(List abilities) {
        this.abilities = abilities;
    }
}
