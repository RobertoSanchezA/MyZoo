package com.robersoft.animals;

public class Mammal extends Animal {
    double weight;
    String habits;
    double speed;
    String diet;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHabits() {
        return habits;
    }

    public void setHabits(String habits) {
        this.habits = habits;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public Mammal(String name, int age, String gender ,double weight, String habits, double speed, String diet) {
        super(name, age, gender);
        this.weight = weight;
        this.habits = habits;
        this.speed = speed;
        this.diet = diet;
    }



}
