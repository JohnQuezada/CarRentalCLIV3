package com.careerdevs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Car car1 = new Car("Honda", "Civic", (short) 2010, "RI123");
        Car car2 = new Car("Hyundai", "Elantra", (short) 2012, "RI456");
        Car car3 = new Car("Ford", "Focus", (short) 2015, "RI789");

//        toString test
//        System.out.println(car1);
//        System.out.println(car2);
//        System.out.println(car3);

//          getter test
//        System.out.println(car1.getMake());

//        setter test
//        car1.setModel("Civic LX");
//        System.out.println(car1.getModel());


        Dealership dealership1 = new Dealership("Java Vehicles");
        dealership1.getAvailableCars().add(car1);
        dealership1.getAvailableCars().add(car2);
        dealership1.getAvailableCars().add(car3);


        System.out.println("Which car would you like to rent? Please input the License Plate.");

        for (int i = 0; i < dealership1.getAvailableCars().size(); i++) {
            System.out.println(dealership1.getAvailableCars().get(i));
        }

        String userInput = scanner.nextLine();
        dealership1.buyCar(userInput);

        System.out.println(dealership1.getAvailableCars());
        System.out.println(dealership1.getSoldCars());


    }
}
