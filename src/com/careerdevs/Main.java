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

        System.out.println("Hello welcome to the " + dealership1.getDealershipName() + " dealership");
        while (true) {
            System.out.println("Would you like to (1) buy a car (2) Return a car or (3) Leave the dealership");
            int res = scanner.nextInt();
            scanner.nextLine();
            if (res == 3) {
                System.out.println("You are now leaving the dealership");
                break;
            } else if (res == 2) {
                // return car
                System.out.println("Which car would you like to return?" + "\n");

                for (int i = 0; i < dealership1.getSoldCars().size(); i++) {
                    System.out.println(dealership1.getSoldCars().get(i));
                }

                System.out.println("\n");

                System.out.print("Please input the License Plate.\nInput:");
                String userInput = scanner.nextLine();

                dealership1.returnCar(userInput);
            } else if (res == 1) {
                // buy car
                System.out.println("Which car would you like to rent?" + "\n");

                for (int i = 0; i < dealership1.getAvailableCars().size(); i++) {
                    System.out.println(dealership1.getAvailableCars().get(i));
                }

                System.out.println("\n");

                System.out.print("Please input the License Plate.\nInput:");
                String userInput = scanner.nextLine();

                dealership1.buyCar(userInput);
            } else {
                System.out.println("Invalid input: please input 1,2, or 3");
            }
        }


//        System.out.println("Which car would you like to rent?" + "\n");
//
//        for (int i = 0; i < dealership1.getAvailableCars().size(); i++) {
//            System.out.println(dealership1.getAvailableCars().get(i));
//        }
//
//        System.out.println("\n");
//
//        System.out.print("Please input the License Plate.\nInput:");
//        String userInput = scanner.nextLine();
//
//        dealership1.buyCar(userInput);

        // System.out.println(dealership1.getAvailableCars());

       // System.out.println(dealership1.getSoldCars());


    }
}
