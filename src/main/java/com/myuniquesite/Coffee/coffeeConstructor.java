package com.myuniquesite.Coffee;

import java.util.Scanner;

public class coffeeConstructor {
    // Static variable (class variable)
    static int coffeeStock = 100;
    static String[] name={"Espresso", "Latte", "Cappuccino"}; //The name of the coffee (e.g., "Espresso", "Latte").
    static String[] type = {"Arabica", "Robusta"}; //The type of coffee (e.g., ).
    static public String[] size = {"Small", "Medium", "Large"}; //The size of the coffee (e.g., "Small", "Medium", "Large").
    static double[] price={50.0,70.0,60.0}; //The price of the coffee.
    static public String[] roastLevel={"Light", "Medium", "Dark"}; //The roast level (e.g., "Light", "Medium", "Dark").
    static String[] origin={"US","JP"}; //The country or region where the coffee beans are from.
    static boolean isDecaf; //A boolean indicating whether the coffee is decaffeinated.
    static boolean stock = coffeeStock != 0; //A boolean or number indicating if the coffee is in stock or the quantity available.
    static String flavorNotes; //An array describing flavor notes (e.g., "Chocolate", "Citrus", "Nutty").
    static String brewMethod; //The brewing method (e.g., "Drip", "French Press", "Espresso").
    static int quantity;
    static String sizeChoice;
    static String roatLevel;
    //static String coffeeBrand = "Coffee Co.";

    // Non-static variables (instance variables)
    //String coffeeName;


    // Static method (can be called without creating an object)
    /*static void showCoffeeBrand() {
        for(int i = 0; i <5; i++){

            System.out.println("Coffee Name: " + name[i] + ", Price: $" + price[i]);
        }
    }*/

    // Non-static method (needs an object to be called)
    /*void displayCoffeeInfo() {
        for(int i = 0; i <5; i++){
            System.out.println("Coffee Name: " + name[i] + ", Price: $" + price[i]);
        }

    }*/

    public static void main(String[] args) {}
/*
        // Accessing static method without creating an object
        //coffeeConstructor.showCoffeeBrand();  // Output: Coffee Brand: Coffee Co.
        while (true) {
        Scanner scanner = new Scanner(System.in);
        displayMenu();
        System.out.print("Choose your coffee (1-" + name.length + ", or 0 to finish): ");
        int choice;
        try {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0) {
                break;
            }
            if (choice < 1 || choice > name.length) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.print("Enter quantity: ");
             quantity = Integer.parseInt(scanner.nextLine()); // This is better to avoid discarding next line character
            if (quantity < 1) {
                System.out.println("Quantity must be at least 1. Please try again.");
                continue;
            }
            System.out.print("Enter Coffee Type: ");
            String typeChoice =scanner.nextLine();
            //System.out.println(typeChoice .toLowerCase());

            System.out.print("Enter size: ");
            sizeChoice =scanner.nextLine();

            System.out.print("Enter Roast Level: ");
            roastLevel =scanner.nextLine();

            //origin

            //isDecaff
            System.out.print("Would you like your coffee Decaffeinated? y/n");
            String decaff = scanner.nextLine();
            if(decaff.equalsIgnoreCase("y")){
                System.out.println("Decaffeinated coffee");
                isDecaf = true;
            }

            //flavorNotes

            //brewMethod
            System.out.print("Enter Brew Method: ");
            String brewMethod =scanner.nextLine();


            //System.out.println(sizeChoice .toLowerCase());

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
       /* // Create an object to access non-static methods and variables
        CoffeeType espresso = new CoffeeType();
        espresso.coffeeName = "Espresso";
        espresso.price = 3.5;

        // Call non-static method using the object
        espresso.displayCoffeeInfo();  // Output: Coffee Name: Espresso, Price: $3.5

        // You can also change static variable directly using the class name
        CoffeeType.coffeeBrand = "Premium Coffee Co.";
        CoffeeType.showCoffeeBrand();  // Output: Coffee Brand: Premium Coffee Co.*/

    /*private static void displayMenu() {
        System.out.println("\n--- Coffee Menu ---");
        for (int i = 0; i < name.length; i++) {
            System.out.println((i + 1) + ". " + name[i]+"\t" + " - " + price[i] + " PHP");
        }

        System.out.println("0. Finish Order");
        System.out.println(stock);
    }
    private static void calculatePrice(sizeChoice) { //: Calculates the price based on the size of the coffee.

    }
    private static void checkStock() {//: Checks if the coffee is in stock.

    }
    private static void addFlavor(note) { //Adds a flavor note to the coffee.
    }
    private static void updateStock(quantity) { //Updates the stock quantity of the coffee
    }
    private static void describe() { // Returns a description of the coffee (e.g., "A dark roast coffee with chocolate and nutty notes").
    }
    private static void setDecaf(isDecaf) { //Updates whether the coffee is decaffeinated.

    }
    private static void changeRoastLevel(newRoastLevel) { //Updates the roast level of the coffee.

    }
    private static void discount() {//Applies a discount to the price of the coffee.
    double discount = 0.0;
    if (quantity >=2 || quantity<=3){
        discount = 0.3;
    }if(quantity >3 || quantity<=6){
        discount = 0.5;
    } if(quantity >6){
        discount = 0.8;
    }
    double percent = quantity * discount;
        System.out.println(discount);

    }
}*/

