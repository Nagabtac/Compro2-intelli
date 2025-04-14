package com.myuniquesite.Exam;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import java.util.List;

public class Coffee {

    private int id;

    @Size(min = 2, max = 20, message = "Coffee name must be between 2 and 20 characters")
    @NotBlank(message = "Coffee name is required")
    private String name;

    @NotBlank(message = "Type is required")
    private String type;

    @NotBlank(message = "Size is required")
    private String size;

    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
    private double price;

    @NotBlank(message = "Roast level is required")
    private String roastLevel;

    @NotBlank(message = "Origin is required")
    private String origin;

    // No annotation needed here; a boolean is always either true or false
    private boolean isDecaf;

    @Min(value = 0, message = "Stock cannot be negative")
    private int stock;

    @NotNull(message = "Flavor notes must not be null")
    @Size(min = 1, message = "At least one flavor note is required")
    private List<@NotBlank(message = "Flavor note cannot be blank") String> flavorNotes;

    @NotBlank(message = "Brew method is required")
    private String brewMethod;

    public Coffee(int id, String name, String type, String size, double price, String roastLevel, String origin, boolean isDecaf, int stock, List<String> flavorNotes, String brewMethod) {
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getRoastLevel() {
        return roastLevel;
    }

    public String getOrigin() {
        return origin;
    }

    public boolean isDecaf() {
        return isDecaf;
    }

    public int getStock() {
        return stock;
    }

    public List<String> getFlavorNotes() {
        return flavorNotes;
    }

    public String getBrewMethod() {
        return brewMethod;
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
}
