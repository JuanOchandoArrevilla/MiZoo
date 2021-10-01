package com.juanSoft.Animals;

public class Birds extends Animals{
    private Double maxFlightAltitude;
    private String color;
    private String legType;

    public Birds(String name, int age, String gender,Double maxFlightAltitude,String color,String legType) {
        super(name, age, gender);
        this.maxFlightAltitude = maxFlightAltitude;
        this.color = color;
        this.legType = legType;
    }


}
