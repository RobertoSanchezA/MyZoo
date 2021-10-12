package com.robersoft.main;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        // El usuario debe poder definir el número de espacios del zoológico
        // y el número de animales que debemos alojar.
        Scanner intro = new Scanner(System.in);
        System.out.print("Introduce el numero de espacios para el Zoo");
        int numOfSpaces = intro.nextInt();
        System.out.print("Introduce el numero de animales para el Zoo");
        int numOfAnimals = intro.nextInt();
    }



}
