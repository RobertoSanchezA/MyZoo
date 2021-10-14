package com.robersoft.animals;

public class Bird extends Animal {
    double flightHeight;
    String color;
    String legType;

    public double getFlightHeight() {
        return flightHeight;
    }

    public void setFlightHeight(double flightHeight) {
        this.flightHeight = flightHeight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLegType() {
        return legType;
    }

    public Bird(String name, int age, String gender,double flightHeight, String color, String legType) {
        super(name, age, gender);
        this.flightHeight = flightHeight;
        this.color = color;
        this.legType = legType;
    }


}


