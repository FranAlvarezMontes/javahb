package com.example;

import java.util.UUID;

import com.example.pizza.Ingredient;
import com.example.pizza.Pizza;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Ingredient queso = Ingredient.create(UUID.randomUUID(), "Queso", Double.valueOf(3));
        Ingredient aceituna = Ingredient.create(UUID.randomUUID(), "aceituna", Double.valueOf(1));

        Pizza pizza1 = Pizza.create(UUID.randomUUID(),"prueba", "Descripcion", "url");
        
        pizza1.addIngredient(queso);
        pizza1.addIngredient(aceituna);
        pizza1.addIngredient(aceituna);     // Ya no admite duplicados
        

        for(Ingredient arg: pizza1.getIngredients()) {
            System.out.println(arg.getName());
        }

        System.out.println("Elementos = " + pizza1.getIngredients().size());
        System.out.println("Precio = " + pizza1.getPrice());

        Pizza pizza2 = Pizza
                        .builder()
                        .setId(UUID.randomUUID())
                        .setName("olivica")
                        .setDescription("con aceitunas")
                        .setUrl("url")
                        .build();

        pizza2.addIngredient(aceituna);

        System.out.println("Elementos = " + pizza2.getIngredients().size());
        System.out.println("Precio = " + pizza2.getPrice());

    }


    
}
