package com.juanSoft.Animals;

public class Mammals extends Animals {
    private double weight;
    private String habits;
    private double speed;
    private String diet;



    public Mammals(String name, int age,String gender,double weight,String habits,double speed,String diet) {
        super(name,age,gender);
        this.weight = weight;
        this.habits = habits;
        this.speed = speed;
        this.diet = diet;
    }


}
