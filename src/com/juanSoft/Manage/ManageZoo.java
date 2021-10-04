package com.juanSoft.Manage;

import com.juanSoft.Animals.TypeMammals.Cats;
import com.juanSoft.Animals.TypeMammals.Dogs;
import com.juanSoft.Animals.TypeMammals.Horses;
import com.juanSoft.Animals.TypesBirds.Geese;
import com.juanSoft.Animals.TypesBirds.Ostriches;
import com.juanSoft.Animals.TypesBirds.Parakeets;
import com.juanSoft.Animals.TypesReptiles.Anacondas;
import com.juanSoft.Animals.TypesReptiles.Cobras;
import com.juanSoft.Animals.TypesReptiles.Crocodiles;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageZoo {
        private int amountSpace;
        ArrayList<String>cages = new ArrayList<String>();
        ArrayList<String> Dogs = new ArrayList<>();
        ArrayList<String> Cats = new ArrayList<>();
        ArrayList<String> Horses = new ArrayList<>();
        ArrayList<String> Geeses = new ArrayList<>();
        ArrayList<String> Ostriches = new ArrayList<>();
        ArrayList<String> Parakeet = new ArrayList<>();
        ArrayList<String> Anacondas = new ArrayList<>();
        ArrayList<String> Cobras = new ArrayList<>();
        ArrayList<String> Crocodiles = new ArrayList<>();

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
            int random = (int) (Math.random() * 9) + 1;

            switch(random) {
                case 1:
                    name = randomName();
                    gender = randomGender();
                    Dogs dog = new Dogs(name, 1, gender, 2.5, "nocturnos", 50, "Carnivoro");
                    if (gender == "Male") {
                         Dogs.add(name + " Dog " + gender);
                    } else {
                        females.add(name + " Dog " + gender);
                    }
                    break;
                case 2:
                    name = randomName();
                    gender = randomGender();
                    Cats cat = new Cats(name, 2, gender, 2.5, "nocturnos", 50, "Carnivoro");
                    if (gender == "Male") {
                        Cats.add(name + " Cat " + gender);
                    } else {
                        females.add(name + " Cat " + gender);
                    }
                    break;
                case 3:
                    name = randomName();
                    gender = randomGender();
                    Horses horse = new Horses(name, 4, gender, 2.5, "diurnos", 30, "Carnivoro");
                    if (gender == "Male") {
                        Horses.add(name + " Horse " + gender);
                    } else {
                        females.add(name + " Horse " + gender);
                    }
                    break;
                case 4:
                    name = randomName();
                    gender = randomGender();
                    Geese goose = new Geese(name, 2, gender, 7.9, "azul", "garra");
                    if (gender == "Male") {
                        Geeses.add(name + " Goose " + gender);
                    } else {
                        females.add(name + " Goose " + gender);
                    }
                    break;
                case 5:
                    name = randomName();
                    gender = randomGender();
                    Ostriches Ostrich = new Ostriches(name, 2, gender, 1.5, "blanco", "garra");
                    if (gender == "Male") {
                        Ostriches.add(name + " Ostrich " + gender);
                    } else {
                        females.add(name + " Ostrich " + gender);
                    }
                    break;
                case 6:
                    name = randomName();
                    gender = randomGender();
                    Parakeets Parakeets = new Parakeets(name, 5, gender, 1.5, "blanco", "garra");
                    if (gender == "Male") {
                        Parakeet.add(name + " Parakeet " + gender);
                    } else {
                        females.add(name + " Parakeet " + gender);
                    }
                    break;
                case 7:
                    name = randomName();
                    gender = randomGender();
                    Anacondas Anaconda = new Anacondas(randomName(), 10, randomGender(), 25, "verde", 50);
                    if (gender == "Male") {
                        Anacondas.add(name + " Anaconda " + gender);
                    } else {
                        females.add(name + " Anaconda" + gender);
                    }
                    break;
                case 8:
                    name = randomName();
                    gender = randomGender();
                    Cobras Cobra = new Cobras(randomName(), 5, randomGender(), 25, "negro", 30);
                    if (gender == "Male") {
                        Cobras.add(name + " Cobra " + gender);
                    } else {
                        females.add(name + "  Cobra " + gender);
                    }
                    break;
                case 9:
                    name = randomName();
                    gender = randomGender();
                    Crocodiles Crocodile = new Crocodiles(randomName(), 5, randomGender(), 25, "negro", 50);
                    if (gender == "Male") {
                        Crocodiles.add(name + " Crocodile " + gender);
                    } else {
                        females.add(name + "  Crocodile " + gender);
                    }
                    break;
            }


        }
        organizeAnimals(females);
    }



    public String randomName() {
        String[] animalsName = {"chiquito", "Mango", "Tifón", "Chimuelo", "Yogu", "Carajito", "Yasuo", "Brego", "Mikasa", "Misifú",
                "Bley", "Hammer", "Jojo", "Manitas", "Wachin", "MaxiBon", "Bodoque", "Itachi", "Mariko", "Estrella", "El bicho", "Tarradellas"};
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

            int countDog = -1;
            int countHorse = -1;
            int countCat = -1;
            int countGoose = -1;
            int countOstrich = -1;
            int countParakeet = -1;
            int countAnaconda = -1;
            int countCobra= -1;
            int countCrocodile = -1;

        for (int i = 0; i < females.size() ; i++) {

            if(females.get(i).contains("Dog")) {
                  if(Dogs.isEmpty()) {
                        Dogs.add(females.get(i));
                        continue;
                     }
                    countDog++;
                  if(Dogs.size() > countDog) {
                    Dogs.set(countDog, Dogs.get(countDog) + " pareja con " + females.get(i));
                  }else {
                     Dogs.add(females.get(i));
                  }

            } else if (females.get(i).contains("Cat")) {
                if(Cats.isEmpty()) {
                    Cats.add(females.get(i));
                    continue;
                }
                countCat++;

                if(Cats.size() > countCat) {
                    Cats.set(countCat, Cats.get(countCat) + " pareja con " + females.get(i));
                }else {
                    Cats.add(females.get(i));
                }


            }  else if (females.get(i).contains("Horse")) {
                if(Horses.isEmpty()) {
                    Horses.add(females.get(i));
                    continue;
                }
                countHorse++;
                if(Horses.size() > countHorse) {
                    Horses.set(countHorse, Horses.get(countHorse) + " pareja con " + females.get(i));
                }else {
                    Horses.add(females.get(i));
                }

            } else if (females.get(i).contains("Goose")) {
                 if(Geeses.isEmpty()) {
                        Geeses.add(females.get(i));
                        continue;
                    }
                    countGoose++;
                 if(Geeses.size() > countGoose) {
                    Geeses.set(countGoose, Geeses.get(countGoose) + " pareja con " + females.get(i));
                 }else {
                    Geeses.add(females.get(i));
                }

            } else if (females.get(i).contains("Ostrich")) {
                if(Ostriches.isEmpty()) {
                    Ostriches.add(females.get(i));
                    continue;
                }
                countOstrich++;
                if(Ostriches.size() > countOstrich) {
                    Ostriches.set(countOstrich, Ostriches.get(countOstrich) + " pareja con " + females.get(i));
                }else {
                    Ostriches.add(females.get(i));
                }

            } else if (females.get(i).contains("Parakeet")) {
                if(Parakeet.isEmpty()) {
                    Parakeet.add(females.get(i));
                    continue;
                }
                countParakeet++;
                if(Parakeet.size() > countParakeet) {
                    Parakeet.set(countParakeet, Parakeet.get(countParakeet) + " pareja con " + females.get(i));
                }else {
                    Parakeet.add(females.get(i));
                }

            } else if (females.get(i).contains("Anaconda")) {
                if(Anacondas.isEmpty()) {
                    Anacondas.add(females.get(i));
                    continue;
                }
                countAnaconda++;
                if(Anacondas.size() > countAnaconda) {
                    Anacondas.set(countAnaconda, Anacondas.get(countAnaconda) + " pareja con " + females.get(i));
                }else {
                    Anacondas.add(females.get(i));
                }

            } else if (females.get(i).contains("Cobra")) {
                if(Cobras.isEmpty()) {
                    Cobras.add(females.get(i));
                    continue;
                }
                countCobra++;
                if(Cobras.size() > countCobra) {
                    Cobras.set(countCobra, Cobras.get(countCobra) + " pareja con " + females.get(i));
                }else {
                    Cobras.add(females.get(i));
                }

            } else if (females.get(i).contains("Crocodile")) {
                if(Crocodiles.isEmpty()) {
                    Crocodiles.add(females.get(i));
                    continue;
                }
                countCrocodile++;
                if(Crocodiles.size() > countCrocodile) {
                    Crocodiles.set(countCrocodile, Crocodiles.get(countCrocodile) + " pareja con " + females.get(i));
                }else {
                    Crocodiles.add(females.get(i));
                }
            }

        }
        createCage();

        lookAnimal();


    }

    private void lookAnimal() {

        for (String s: Dogs) {
            addAnimalZoo(s);
        }

        for (String s: Cats) {
            addAnimalZoo(s);
        }

        for (String s: Horses) {
            addAnimalZoo(s);
        }

        for (String s: Geeses) {
            addAnimalZoo(s);
        }

        for (String s: Ostriches) {
            addAnimalZoo(s);
        }

        for (String s: Parakeet) {
            addAnimalZoo(s);
        }

        for (String s: Anacondas) {
            addAnimalZoo(s);
        }

        for (String s: Cobras) {
            addAnimalZoo(s);
        }

        for (String s: Crocodiles) {
            addAnimalZoo(s);
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

    public void addAnimalZoo(String animal) {

            nameCage++;
            indexCage++;
            cages.set(indexCage,"cage " +  nameCage + ":" + animal);
    }
}
