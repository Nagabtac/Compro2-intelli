package com.crude.review;

import java.util.List;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;

public class Coffee {

    private int id; 

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Type cannot be blank")
    private String type;

    @NotBlank(message = "Size cannot be blank")
    private String size;

    @DecimalMin(value = "0.01", message = "Price must be greater than 0")
    private double price;

    @NotBlank(message = "Roast Level cannot be blank")
    private String roastLevel;

    @Size(max = 100, message = "Origin must be below 100 characters")
    @NotBlank(message = "Origin cannot be blank")
    private String origin;

    private boolean isDecaf;

    @Min(value = 1, message = "Stock must be greater than 0")
    private int stock;

    private List<String> flavorNotes;

    @NotBlank(message = "Brew Method cannot be blank")
    private String brewMethod;

    private String profilePicture;

    public Coffee() {}

    public Coffee(int id, String name, String type, String size, double price, String roastLevel, String origin,
                boolean isDecaf, int stock, List<String> flavorNotes, String brewMethod) {
        this.id = id;
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

    public Coffee(int id, String name, String type, String size, double price, String roastLevel, String origin,
                boolean isDecaf, int stock, List<String> flavorNotes, String brewMethod, String profilePicture) {
        this.id = id;
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
        this.profilePicture = profilePicture;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }
    public String getSize() { return size; }
    public double getPrice() { return price; }
    public String getRoastLevel() { return roastLevel; }
    public String getOrigin() { return origin; }
    public boolean isDecaf() { return isDecaf; }
    public int getStock() { return stock; }
    public List<String> getFlavorNotes() { return flavorNotes; }
    public String getBrewMethod() { return brewMethod; }
    public String getProfilePicture() { return profilePicture; }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRoastLevel(String roastLevel) {
        this.roastLevel = roastLevel;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDecaf(boolean isDecaf) {
        this.isDecaf = isDecaf;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setFlavorNotes(List<String> flavorNotes) {
        this.flavorNotes = flavorNotes;
    }

    public void setBrewMethod(String brewMethod) {
        this.brewMethod = brewMethod;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
}
