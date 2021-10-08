package com.juanSoft.Animals.Reptiles;

import com.juanSoft.Animals.Animal;

public class Reptile extends Animal {
     private int bodyTemperature;
     private String color;
     private int speed;

    public Reptile(String name, int age, gender gender, int bodyTemperature, String color, int speed) {
        super(name, age, gender);
         this.bodyTemperature = bodyTemperature;
        this.color = color;
        this.speed = speed;
    }
}
