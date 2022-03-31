package com.careerdevs;
import java.util.ArrayList;
import java.util.List;


public class Dealership {

    private String dealershipName;
    private List<Car> availableCars;
    private List<Car> soldCars;

    public Dealership (String dealershipName) {

        this.dealershipName = dealershipName;
        this.availableCars = new ArrayList<>();
        this.soldCars = new ArrayList<>();
    }

    public String getDealershipName() {
        return dealershipName;
    }

    public List<Car> getAvailableCars() {
        return availableCars;
    }

    public List<Car> getSoldCars() {
        return soldCars;
    }

    public void setDealershipName(String dealershipName) {
        this.dealershipName = dealershipName;
    }

    public void setAvailableCars(List<Car> availableCars) {
        this.availableCars = availableCars;
    }

    public void setSoldCars(List<Car> soldCars) {
        this.soldCars = soldCars;
    }

    public void buyCar(String license) {

        if (availableCars.size() == 0) {
            System.out.println("sorry there are no cars available");
            return;
        }
        for (int i = 0; i < availableCars.size(); i++) {
        //  If the license plate passed into the method matches a license plate of a car in our ArrayList, then we will place it in the soldCars array, and remove it from the availableCars array.
            if (license.equals(availableCars.get(i).getLicenseplate())) {
                System.out.println("Congratulations you purchased " + availableCars.get(i));
                soldCars.add(availableCars.get(i));
                availableCars.remove(availableCars.get(i));
                return; // ends the function
            }
        }

        System.out.println("Invalid input. No cars available with that license plate.");
    }

    public void returnCar(String license) {

        if (soldCars.size() == 0) {
            System.out.println("No cars currently sold>");
        }

        for (int i = 0; i < soldCars.size(); i++) {

            if (license.equals(soldCars.get(i).getLicenseplate())) {
                System.out.println("Thank you for returning " + soldCars.get(i));
                availableCars.add(soldCars.get(i));
                soldCars.remove((soldCars.get(i)));
                return;
            }
        }

        System.out.println("Invalid input. No cars available with that license plate.");
    }
}
