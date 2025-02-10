package com.myuniquesite.Coffee;
public class main {
    // Static variable (class variable)
    static int coffeeStock = 100;
    static String[] name = {"Espresso", "Latte", "Cappuccino"}; //The name of the coffee (e.g., "Espresso", "Latte").
    static String[] type = {"Arabica", "Robusta"}; //The type of coffee (e.g., ).
    static public String[] size = {"Small", "Medium", "Large"}; //The size of the coffee (e.g., "Small", "Medium", "Large").
    public static double[] price = {50.0, 70.0, 60.0}; //The price of the coffee.
    static public String[] roastLevel = {"Light", "Medium", "Dark"}; //The roast level (e.g., "Light", "Medium", "Dark").
    static String[] origin = {"Ethiopia", "Central and West Africa"}; //The country or region where the coffee beans are from.
    static boolean isDecaf; //A boolean indicating whether the coffee is decaffeinated.
    static boolean stock = coffeeStock != 0; //A boolean or number indicating if the coffee is in stock or the quantity available.
    static String flavorNotes; //An array describing flavor notes (e.g., "Chocolate", "Citrus", "Nutty").
    static String brewMethod; //The brewing method (e.g., "Drip", "French Press", "Espresso").
    public static int quantity;
    static int sizeChoice;
    static int roastLevelChoice;
    static int typeChoice;
}