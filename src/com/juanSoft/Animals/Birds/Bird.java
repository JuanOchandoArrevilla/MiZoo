package com.juanSoft.Animals.Birds;

import com.juanSoft.Animals.Animal;

public class Bird extends Animal {
    private Double maxFlightAltitude;
    private String color;
    private String legType;

    public enum legType {
        PALMIPEDA,
        GARRA
    }


    public Bird(String name, int age, gender gender, Double maxFlightAltitude, String color, legType legType) {
        super(name, age, gender);
        this.maxFlightAltitude = maxFlightAltitude;
        this.color = color;
        legType = legType;
    }


}
