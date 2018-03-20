package com.gareth;

//Bridge

public class MacnCheese extends Meal {

    public MacnCheese()
    {

    }

    public MacnCheese(MainIngredient mIn)
    {
        super(mIn);
    }

    public void chooseMainIngredient()
    {
        System.out.println("Meal has a main ingredient");
        mainIngredient.chooseMainIngredient();
    }
}
