package com.juanSoft.Animals.Mammals;

import com.juanSoft.Animals.Animal;

public class Mammal extends Animal {
    private double weight;
    private double speed;

    public enum habits {
     NOCTURNOS,
     DIURNOS
    }

    public enum diet {
      CARNIVORO,
      HERBIVORO,
      OMNIVORO
    }
    public Mammal(String name, int age, gender gender, double weight, habits habits, double speed, diet diet) {
        super(name,age,gender);
        this.weight = weight;
        habits = habits;
        this.speed = speed;
        diet = diet;
    }

//    public String toString() {
//        return Animals.randomName() + " " + Animals.randomGender();
//    }

}
