package com.myuniquesite.Coffee;

public class coffee {
    // Properties (Attributes)
    String name;
    String type;
    String size;
    double price;
    String roastLevel;
    String origin;
    boolean isDecaf;
    int stock;
    String flavorNotes;
    String brewMethod;

    // Constructor
    public coffee(String name, String type, String size, double price, String roastLevel, String origin, boolean isDecaf, int stock, String flavorNotes, String brewMethod) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
        this.roastLevel = roastLevel;
        this.origin = origin;
        this.isDecaf = isDecaf;
        this.stock = stock;
        this.flavorNotes = flavorNotes;
        this.brewMethod = brewMethod;
    }

    // Methods (Actions)

    public double calculatePrice() {
        // Implement price calculation logic based on size
        if (size.equals("Small")) {
            return price;
        } else if (size.equals("Medium")) {
            return price + 10; // For example, medium is 10 more
        } else if (size.equals("Large")) {
            return price + 20; // Large is 20 more
        }
        return price; // Default
    }

    public boolean checkStock() {
        return stock > 0;
    }

    public void addFlavor(String note) {
        flavorNotes += ", " + note;
    }

    public void updateStock(int quantity) {
        stock -= quantity;
    }

    public String describe() {
        return "A " + roastLevel + " roast coffee from " + origin + " with flavor notes of " + flavorNotes + ".";
    }

    public void setDecaf(boolean isDecaf) {
        this.isDecaf = isDecaf;
    }

    public void changeRoastLevel(String newRoastLevel) {
        this.roastLevel = newRoastLevel;
    }

    public void discount(int quantity) {
        double discount = 0.0;
        if (quantity >= 2 && quantity <= 3) {
            discount = 0.3;
        } else if (quantity > 3 && quantity <= 6) {
            discount = 0.5;
        } else if (quantity > 6) {
            discount = 0.8;
        }
        double finalPrice = calculatePrice() * (1 - discount);
        System.out.println("Discount applied: " + discount * 100 + "%");
        System.out.println("Total Price: " + finalPrice);
    }
}
