package com.juanSoft.Animals;

public class Reptiles extends Animals {
     private int bodyTemperature;
     private String color;
     private int speed;

    public Reptiles(String name, int age, String gender, int bodyTemperature, String color, int speed) {
        super(name, age, gender);
         this.bodyTemperature = bodyTemperature;
        this.color = color;
        this.speed = speed;
    }
}
