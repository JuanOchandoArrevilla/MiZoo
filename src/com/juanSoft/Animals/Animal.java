package com.juanSoft.Animals;

public class Animal {

    public String name;
    public int age;

    public enum gender {
        MALES,
        FEMALES;
    }

    public Animal(String name, int age, gender gender) {
       this.name = name;
       this.age = age;
       gender = gender;
    }


    public static gender randomGender() {
       gender gender [] = {Animal.gender.MALES, Animal.gender.FEMALES};
        int random = (int) (Math.random() * gender.length);
       gender selectGender = gender[random];
        return selectGender;
    }

    public static String randomName() {
        String[] animalsName = {"chiquito", "Mango", "Tifón", "Chimuelo", "Yogu", "Carajito", "Yasuo", "Brego", "Mikasa", "Misifú",
                "Bley", "Hammer", "Jojo", "Manitas", "Wachin", "MaxiBon", "Bodoque", "Itachi", "Mariko", "Estrella", "El bicho", "Tarradellas"};
        int random = (int) (Math.random() * animalsName.length);
        String name = animalsName[random];
        return name;
    }


}
