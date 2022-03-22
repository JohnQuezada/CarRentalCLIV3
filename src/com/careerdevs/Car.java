package com.careerdevs;

// Car Class, which represents a real world object
public class Car {

    // Fields
    String make;
    String model;
    short year;


    // Constructor
    //

    public Car(String make, String model, short year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }


    // Getters and Setters are used to protect your data, particularly when creating classes.
    // Getters and setters allow you to control how important variables are accessed and updated in your code.
    // The getter method returns the value of the attribute. The setter method takes a parameter and assigns it to the attribute.


    // Getters,

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public short getYear() {
        return year;
    }

    // Setters

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(short year) {
        this.year = year;
    }


    // Override toString to make the resulting information legible

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
