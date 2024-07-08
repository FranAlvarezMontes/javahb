package com.example.pizza;

import java.util.ArrayList;
import java.util.UUID;

public class PizzaFran extends EntityBase{
    
    private UUID id;

    private String name;

    private String description;

    private String url;

    private ArrayList<Ingredient> ingredients = new ArrayList<>();


    


    private PizzaFran(UUID id, String name, String description, String url) {
        super(id);
        this.id = id;
        this.name = name;
        this.description = description;
        this.url = url;
    }

    public PizzaFran create(UUID id, String name, String description, String url ){

        PizzaFran pizza = new PizzaFran(id, name, description,url);

        return pizza;
    }

    public void addIngredient(Ingredient ingrediente)
    {
        ingredients.add(ingrediente);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public Double getPrecio() {

        Double precio = Double.valueOf(0);
        
        for (Ingredient ingredient : ingredients) {
            precio += ingredient.getPrice();
        }

        precio = precio * 1.2;

        return precio;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

 
}



