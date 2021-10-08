package com.juanSoft.Manage;

import com.juanSoft.Animals.Animal;
import com.juanSoft.Animals.Birds.Bird;
import com.juanSoft.Animals.Mammals.Cats;
import com.juanSoft.Animals.Mammals.Dogs;
import com.juanSoft.Animals.Mammals.Horses;
import com.juanSoft.Animals.Mammals.Mammal;
import com.juanSoft.Animals.Birds.Geese;
import com.juanSoft.Animals.Birds.Ostriches;
import com.juanSoft.Animals.Birds.Parakeets;
import com.juanSoft.Animals.Reptiles.Anacondas;
import com.juanSoft.Animals.Reptiles.Cobras;
import com.juanSoft.Animals.Reptiles.Crocodiles;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageZoo {
    private int amountSpace;
    ArrayList<String> cages = new ArrayList<>();
    ArrayList<String> dogs = new ArrayList<>();
    ArrayList<String> cats = new ArrayList<>();
    ArrayList<String> horses = new ArrayList<>();
    ArrayList<String> geeses = new ArrayList<>();
    ArrayList<String> ostriches = new ArrayList<>();
    ArrayList<String> parakeets = new ArrayList<>();
    ArrayList<String> anacondas = new ArrayList<>();
    ArrayList<String> cobras = new ArrayList<>();
    ArrayList<String> crocodiles = new ArrayList<>();
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
        Animal.gender gender;
        ArrayList<String> females = new ArrayList<>();
        for (int i = 0; i < getNumAnimals(); i++) {
            int random = (int) (Math.random() * 9) + 1;

            switch(random) {
                case 1:
                    name = Animal.randomName();
                    gender =  Animal.randomGender();
                    Dogs dog = new Dogs(name, ((int)(Math.random() * 9) + 1), gender, (Math.random() * 50) + 1, Mammal.habits.NOCTURNOS,
                            ((int)(Math.random() * 30) + 1), Mammal.diet.CARNIVORO);

                    if (Animal.gender.MALES == gender) {
                        dogs.add(name + " Dog " + gender );
                    } else {
                        females.add(name + " Dog " + gender);
                    }

                    break;
                case 2:
                    name = Animal.randomName();
                    gender = Animal.randomGender();
                    Cats cat = new Cats(name, ((int)(Math.random() * 9) + 1), gender, (Math.random() * 50) + 1,
                            Mammal.habits.NOCTURNOS, ((int)(Math.random() * 30) + 1), Mammal.diet.CARNIVORO);
                    if (Animal.gender.MALES == gender) {
                      cats.add(name + " Cat " + gender);
                    } else {
                        females.add(name + " Cat " + gender);
                    }
                    break;
                case 3:
                    name = Animal.randomName();
                    gender = Animal.randomGender();
                    Horses horse = new Horses(name, ((int)(Math.random() * 9) + 1), gender, (Math.random() * 50) + 1,
                            Mammal.habits.DIURNOS, ((int)(Math.random() * 30) + 1), Mammal.diet.CARNIVORO);
                    if (Animal.gender.MALES == gender) {
                        horses.add(name + " Horse " + gender);
                    } else {
                        females.add(name + " Horse " + gender);
                    }
                    break;
                case 4:
                    name = Animal.randomName();
                    gender = Animal.randomGender();
                    Geese goose = new Geese(name, ((int)(Math.random() * 9) + 1), gender, 7.9, "azul", Bird.legType.GARRA);
                    if (Animal.gender.MALES == gender) {
                        geeses.add(name + " Goose " + gender);
                    } else {
                        females.add(name + " Goose " + gender);
                    }
                    break;
                case 5:
                    name = Animal.randomName();
                    gender = Animal.randomGender();
                    Ostriches Ostrich = new Ostriches(name, ((int)(Math.random() * 9) + 1), gender, 1.5, "blanco", Bird.legType.GARRA);
                    if (Animal.gender.MALES == gender) {
                        ostriches.add(name + " Ostrich " + gender);
                    } else {
                        females.add(name + " Ostrich " + gender);
                    }
                    break;
                case 6:
                    name = Animal.randomName();
                    gender = Animal.randomGender();
                    Parakeets Parakeet = new Parakeets(name, ((int)(Math.random() * 9) + 1), gender, 1.5, "blanco", Bird.legType.PALMIPEDA);
                    if (Animal.gender.MALES == gender) {
                        parakeets.add(name + " Parakeet " + gender);
                    } else {
                        females.add(name + " Parakeet " + gender);
                    }
                    break;
                case 7:
                    name = Animal.randomName();
                    gender = Animal.randomGender();
                    Anacondas Anaconda = new Anacondas( name, ((int)(Math.random() * 9) + 1), gender, 25, "verde", 50);
                    if (Animal.gender.MALES == gender) {
                        anacondas.add(name + " Anaconda  " + gender);
                    } else {
                        females.add(name + " Anaconda " + gender);
                    }
                    break;
                case 8:
                    name = Animal.randomName();
                    gender = Animal.randomGender();
                    Cobras Cobra = new Cobras( name, ((int)(Math.random() * 9) + 1), gender, 25, "negro", 30);
                    if (Animal.gender.MALES == gender) {
                        cobras.add(name + " Cobra " + gender);
                    } else {
                        females.add(name + "  Cobra " + gender);
                    }
                    break;
                case 9:
                    name = Animal.randomName();
                    gender = Animal.randomGender();
                    Crocodiles Crocodile = new Crocodiles( name, ((int)(Math.random() * 9) + 1), gender, 25, "negro", 50);
                    if (Animal.gender.MALES == gender) {
                        crocodiles.add(name + " Crocodile " + gender);
                    } else {
                        females.add(name + "  Crocodile " + gender);
                    }
                    break;
            }

        }
        organizeAnimals(females);
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
                  if(dogs.isEmpty()) {
                        dogs.add(females.get(i));
                        countDog++;
                        continue;
                     }
                    countDog++;
                  if(dogs.size() > countDog) {
                          dogs.set(countDog, dogs.get(countDog) + " pareja con " + females.get(i));
                  } else {
                      dogs.add(females.get(i));
                  }
            } else if (females.get(i).contains("Cat")) {
                if(cats.isEmpty()) {
                    countCat++;
                    cats.add(females.get(i));
                    continue;
                }
                countCat++;
                if(cats.size() > countCat) {
                        cats.set(countCat, cats.get(countCat) + " pareja con " + females.get(i));
                } else {
                        cats.add(females.get(i));
                }

            }  else if (females.get(i).contains("Horse")) {
                if(horses.isEmpty()) {
                    horses.add(females.get(i));
                    countHorse++;
                    continue;
                }
                countHorse++;
                if(horses.size() > countHorse) {
                    horses.set(countHorse, horses.get(countHorse) + " pareja con " + females.get(i));
                }else {
                    horses.add(females.get(i));
                }

            } else if (females.get(i).contains("Goose")) {
                 if(geeses.isEmpty()) {
                        countGoose++;
                        geeses.add(females.get(i));
                        continue;
                    }
                    countGoose++;
                 if(geeses.size() > countGoose) {
                    geeses.set(countGoose, geeses.get(countGoose) + " pareja con " + females.get(i));
                 }else {
                    geeses.add(females.get(i));
                }

            } else if (females.get(i).contains("Ostrich")) {
                if(ostriches.isEmpty()) {
                    countOstrich++;
                    ostriches.add(females.get(i));
                    continue;
                }
                countOstrich++;
                if(ostriches.size() > countOstrich) {
                    ostriches.set(countOstrich, ostriches.get(countOstrich) + " pareja con " + females.get(i));
                }else {
                    ostriches.add(females.get(i));
                }

            } else if (females.get(i).contains("Parakeet")) {
                if(parakeets.isEmpty()) {
                    parakeets.add(females.get(i));
                    countParakeet++;
                    continue;
                }
                countParakeet++;
                if(parakeets.size() > countParakeet) {
                    parakeets.set(countParakeet, parakeets.get(countParakeet) + " pareja con " + females.get(i));
                }else {
                    parakeets.add(females.get(i));
                }

            } else if (females.get(i).contains("Anaconda")) {
                if(anacondas.isEmpty()) {
                    countAnaconda++;
                    anacondas.add(females.get(i));
                    continue;
                }
                countAnaconda++;
                if(anacondas.size() > countAnaconda) {
                    anacondas.set(countAnaconda, anacondas.get(countAnaconda) + " pareja con " + females.get(i));
                }else {
                    anacondas.add(females.get(i));
                }

            } else if (females.get(i).contains("Cobra")) {
                if(cobras.isEmpty()) {
                    cobras.add(females.get(i));
                    countCobra++;
                    continue;
                }
                countCobra++;
                if(cobras.size() > countCobra) {
                    cobras.set(countCobra, cobras.get(countCobra) + " pareja con " + females.get(i));
                }else {
                    cobras.add(females.get(i));
                }

            } else if (females.get(i).contains("Crocodile")) {
                if(crocodiles.isEmpty()) {
                    crocodiles.add(females.get(i));
                    countCrocodile++;
                    continue;
                }
                countCrocodile++;
                if(crocodiles.size() > countCrocodile) {
                    crocodiles.set(countCrocodile, crocodiles.get(countCrocodile) + " pareja con " + females.get(i));
                }else {
                    crocodiles.add(females.get(i));
                }
            }

        }
        createCage();

        lookAnimal();


    }

    private void lookAnimal() {

        for (String s: dogs) {
            addAnimalZoo(s);
        }

        for (String s: cats) {
            addAnimalZoo(s);
        }

        for (String s: horses) {
            addAnimalZoo(s);
        }

        for (String s: geeses) {
            addAnimalZoo(s);
        }

        for (String s: ostriches) {
            addAnimalZoo(s);
        }

        for (String s: parakeets) {
            addAnimalZoo(s);
        }

        for (String s: anacondas) {
            addAnimalZoo(s);
        }

        for (String s: cobras) {
            addAnimalZoo(s);
        }

        for (String s: crocodiles) {
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
