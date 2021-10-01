package com.juanSoft.Manage;
import com.juanSoft.Animals.Birds;
import com.juanSoft.Animals.Mammals;
import com.juanSoft.Animals.Reptiles;

import java.util.Scanner;

public class ManageZoo {

    public ManageZoo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("cuantos animales quieres en el zoologico virtual?");
        int numAnimals = sc.nextInt();

        createAnimals(numAnimals);

        sc.close();
    }

    public void createAnimals(int numAnimals) {

        for (int i = 0; i < numAnimals; i++) {

            int random = (int) (Math.random() * 3) + 1;

                 if (random == 1) {
                     Mammals mammal = new Mammals(randomName(),10,randomGender(),25.5,"diurnos",50,"Carnivoro");
                     System.out.println(randomName() + " Mammal " + randomGender());
                 } else if (random == 2) {
                     Birds bird = new Birds(randomName(),2,randomGender(),50.5,"azul","garra");
                     System.out.println(randomName() + "  Bird " + randomGender());

                 } else {
                     Reptiles reptile = new Reptiles(randomName(),1,randomGender(),25,"verde",35);
                     System.out.println(randomName() + "  Reptile " + randomGender());
                 }

        }
    }

    public String randomName() {
        String[] animalsName = {"chiquito","Mango","Tifón","Chimuelo","Yogu","Carajito","Yasuo","Brego","Mikasa","Misifú","Bley","Hammer","Jojo","Manitas","Wachin che",
                "MaxiBon","Bodoque","Itachi","Mariko","Estrella","El bicho","Tarradellas"};
        int random = (int) (Math.random() * animalsName.length);
        String name = animalsName[random];
        return name;
    }

    public String randomGender() {
        String[] gender = {"Male","Female"};
        int random = (int) (Math.random() * gender.length);
        String selectGender = gender[random];
        return selectGender;
    }
}
