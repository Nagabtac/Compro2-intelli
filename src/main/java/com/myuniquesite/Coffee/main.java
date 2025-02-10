package com.myuniquesite.Coffee;

public class main {
    public static void main(String[] args) {
        // Create two Coffee objects with sample values
        coffee coffee1 = new coffee(
                "Espresso", "Arabica", "Medium",
                50.0, "Medium", "Ethiopia", false,
                100, "Chocolate, Nutty", "Espresso Machine"
        );

        coffee coffee2 = new coffee(
                "Latte", "Robusta", "Large", 70.0,
                "Light", "Central and West Africa", true,
                50, "Creamy, Sweet", "French Press"
        );


        // Call methods on the first coffee object (coffee1)
        System.out.println("Coffee 1 Description: " + coffee1.describe());
        System.out.println("Price for " + coffee1.size + " " + coffee1.name + ": " + coffee1.calculatePrice());
        coffee1.addFlavor("Fruity");
        System.out.println("Updated flavor notes: " + coffee1.flavorNotes);
        coffee1.discount(3); // Apply discount for 3 items

        // Call methods on the second coffee object (coffee2)
        System.out.println("\nCoffee 2 Description: " + coffee2.describe());
        System.out.println("Price for " + coffee2.size + " " + coffee2.name + ": " + coffee2.calculatePrice());
        coffee2.setDecaf(true);
        System.out.println("Is coffee decaf? " + coffee2.isDecaf);
        coffee2.discount(6); // Apply discount for 6 items


    }
}
