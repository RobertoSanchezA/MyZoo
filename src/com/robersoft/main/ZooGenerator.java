package com.robersoft.main;

import com.robersoft.animals.*;

import java.util.ArrayList;

public class ZooGenerator {

    //Entiendo que lo ideal es meter la parte de la funcionalidad en un clase
    //Lo que no sé es si los datos que hay que introducir por teclado los pediría aqui o en el main

    private ArrayList<Animal> animals = new ArrayList<>();

    String animalName[] = { "Itachi", "Benito Antonio Martínez Ocasio", "Goku", "Anuel", "Añañin", "Manitas",
            "Christian Macias", "Ete-Sech", "Luigi", "Elma Sapán", "Buitoni", "Elso Bradillo", "Tarradellas" };

    String colors[] = { "green", "white", "black", "red", "blue" };

    public double genRandomTemperature() {
        return Math.random() * 45;
    }

    public String selectColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public double genRandomMaxSpeed() {

        return Math.random() * 40;
    }

    public double genRandomWeight() {
        return Math.random() * 1500;
    }

    public String selectHabit() {
        return Math.random() > 0.5 ? "Nocturno" : "Diurno";
    }

    public String selectDiet() {
        double number = Math.random();
        if (number < 0.33) {
            return "Omnívoro";
        } else if (number < 0.66) {
            return "Herbívoro";
        } else {
            return "Carnívoro";
        }
    }

    public double genMaxHeight() {
        return Math.random() * 4500;
    }

    public String genLegType() {
        return Math.random() > 0.5 ? "Palmípedo" : "Garra";
    }



    public String selectName() {
        String name = "";
        // generar numero de la posicion que voy a seleccionar
        int indexOfName = (int) (Math.random() * (animalName.length)) ;
        name = animalName[indexOfName];

        return name;
    }

    public String selectRandomGender() {
        String male = "Macho";
        String female = "Hembra";

        // genero un 1 para macho, 2 para hembra
        int select = (int) (Math.random() * (2 - 1 + 1) + 1);
        if (select == 1)
            return male;
        else
            return female;
    }

    public int generateRandomAge() {
        return ((int) (Math.random() * 150));
    }


    //Esta seria la forma mas sencilla que vi para meter los animales si estos y los espacios son iguales

    // Generacion de animales
    public void generateZoo(int numOfSpaces, int numOfAnimals) {
        // genero un numero con el que se crea el animal aleatorio

        if (numOfAnimals == numOfSpaces) {
            for (int i = 0; i < numOfAnimals; i++) {
                int random = (int) (Math.random() * 6);
                switch (random) {
                    case 1:
                        Animal cam = new Camaleon(selectName(), generateRandomAge(), selectRandomGender(),
                                genRandomTemperature(), selectColor(), genRandomMaxSpeed());
                        animals.add(cam);
                        break;

                    case 2:
                        Animal chin = new Chinchilla(selectName(), generateRandomAge(), selectRandomGender(),
                                genRandomWeight(), selectHabit(), genRandomMaxSpeed(), selectDiet());
                        animals.add(chin);
                        break;

                    case 3:
                        Animal cigu = new Cigüeña(selectName(), generateRandomAge(), selectRandomGender(),
                                genMaxHeight(), selectColor(), genLegType());
                        animals.add(cigu);
                        break;

                    case 4:
                        Animal cond = new Condor(selectName(), generateRandomAge(), selectRandomGender(),
                                genMaxHeight(), selectColor(), genLegType());
                        animals.add(cond);
                        break;

                    case 5:
                        Animal igu = new Iguana(selectName(), generateRandomAge(), selectRandomGender(),
                                genRandomTemperature(), selectColor(), genRandomMaxSpeed());
                        animals.add(igu);
                        break;

                    case 6:
                        Animal orni = new Ornitorrinco(selectName(), generateRandomAge(), selectRandomGender(),
                                genRandomWeight(), selectHabit(), genRandomMaxSpeed(), selectDiet());
                        animals.add(orni);
                        break;

                }
            }
        }
    }
}
