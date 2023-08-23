package com.example.pizzasender.applicationController;

import java.util.List;

public class Pizza {
    private String name;
    private List<String> ingredients;
    private double price;

    public Pizza(String name, List<String> ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public Pizza() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
