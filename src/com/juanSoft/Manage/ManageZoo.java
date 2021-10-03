package com.juanSoft.Manage;
import com.juanSoft.Animals.Birds;
import com.juanSoft.Animals.Mammals;
import com.juanSoft.Animals.Reptiles;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageZoo {
        private int amountSpace;
        ArrayList<String>cages = new ArrayList<String>();
        ArrayList<String> Mammals = new ArrayList<>();
        ArrayList<String> Birds = new ArrayList<>();
        ArrayList<String> Reptiles = new ArrayList<>();
        private int nameCage ;
        private int indexCage = -1;
        private int numAnimals;

    public int getNumAnimals() {
        return numAnimals;
    }

        public int getAmountSpace() {
        return amountSpace;
    }

    public ManageZoo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos metros quieres para el zologico virtual ?");
         amountSpace = sc.nextInt();
        System.out.println("cuantos animales quieres en el zoologico virtual?");
        numAnimals = sc.nextInt();

            try {
                createAnimals();
                showDataZoo();
            }catch(IndexOutOfBoundsException e ) {
                System.out.println("error: las caracteristicas admitidas son icorrecta");
            }

        sc.close();
    }

    public void createAnimals() {
        String name;
        String gender;
        ArrayList<String> females = new ArrayList<>();
        for (int i = 0; i < getNumAnimals(); i++) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                    name = randomName();
                    gender = randomGender();
                    Mammals mammal = new Mammals(name, 10, gender, 25.5, "diurnos", 50, "Carnivoro");
                if (gender == "Male") {
                    Mammals.add(name + " Mammal " + gender);
                } else {
                    females.add(name + " Mammal " + gender);
                }
            }else if (random == 2) {
                    name = randomName();
                    gender = randomGender();
                    Birds bird = new Birds(name, 2, gender, 50.5, "azul", "garra");
                if (gender == "Male") {
                    Birds.add(name + " Bird " + gender);
                } else {
                    females.add(name + " Bird " + gender);
                }
            } else {
                    name = randomName();
                    gender = randomGender();
                    Reptiles reptile = new Reptiles(randomName(), 1, randomGender(), 25, "verde", 35);
                if (gender == "Male") {
                    Reptiles.add(name + " Reptile " + gender);
                } else {
                    females.add(name + " Reptile " + gender);
                }

            }
        }
        organizeAnimals(females);
    }

    public String randomName() {
        String[] animalsName = {"chiquito", "Mango", "Tifón", "Chimuelo", "Yogu", "Carajito", "Yasuo", "Brego", "Mikasa", "Misifú",
                "Bley", "Hammer", "Jojo", "Manitas", "Wachin che", "MaxiBon", "Bodoque", "Itachi", "Mariko", "Estrella", "El bicho", "Tarradellas"};
        int random = (int) (Math.random() * animalsName.length);
        String name = animalsName[random];
        return name;
    }

    public String randomGender() {
        String[] gender = {"Male", "Female"};
        int random = (int) (Math.random() * gender.length);
        String selectGender = gender[random];
        return selectGender;
    }

    public void organizeAnimals(ArrayList<String> females) {

            int countMamals = -1;
            int countRaptiles = -1;
            int countBirds = -1;
        for (int i = 0; i < females.size() ; i++) {

            if(females.get(i).contains("Mammal")) {
                  if(Mammals.isEmpty()) {
                        Mammals.add(females.get(i));
                        continue;
                     }
                    countMamals++;
                  if(Mammals.size() > countMamals) {
                    Mammals.set(countMamals, Mammals.get(countMamals) + " pareja con " + females.get(i));
                  }else {
                     Mammals.add(females.get(i));
                  }

            } else if (females.get(i).contains("Bird")) {
                if(Birds.isEmpty()) {
                    Birds.add(females.get(i));
                    continue;
                }
                countBirds++;

                if(Birds.size() > countBirds) {
                    Birds.set(countBirds, Birds.get(countBirds) + " pareja con " + females.get(i));
                }else {
                    Birds.add(females.get(i));
                }

            }  else if (females.get(i).contains("Reptile")) {
                if(Reptiles.isEmpty()) {
                    Reptiles.add(females.get(i));
                    continue;
                }
                countRaptiles++;
                if(Reptiles.size() > countRaptiles) {
                    Reptiles.set(countRaptiles, Reptiles.get(countRaptiles) + " pareja con " + females.get(i));
                }else {
                    Reptiles.add(females.get(i));
                }
            }
        }
        createCage();

        for (String s: Mammals) {
            addAnimal(s);
        }
        for (String s: Birds) {
            addAnimal(s);
        }
        for (String s: Reptiles) {
            addAnimal(s);
        }


    }


    public void createCage() {
        for (int i = 1; i <= getAmountSpace(); i++) {
            cages.add("cage " + i + ":");
        }
    }

    public void showDataZoo() {
        for (String s:cages) {
            System.out.println(s);
        }
    }

    public void addAnimal(String animal) {

            nameCage++;
            indexCage++;
            cages.set(indexCage,"cage " +  nameCage + ":" + animal);
    }
}
