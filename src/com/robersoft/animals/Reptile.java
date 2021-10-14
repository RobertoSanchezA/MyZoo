package com.robersoft.animals;

public class Reptile extends Animal {
    double temperature;
    String color;
    double speed;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Reptile(){}

    public Reptile(String name, int age, String gender, double temperature, String color, double speed) {
        super(name, age, gender);
        this.temperature = temperature;
        this.color = color;
        this.speed = speed;
    }



}
