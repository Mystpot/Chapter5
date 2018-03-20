package com.gareth;


//Bridge

public abstract class Meal {

    protected MainIngredient mainIngredient;

    public Meal ()
    {

    }

    public Meal ( MainIngredient mI)
    {
        this.mainIngredient = mI;
    }

    abstract public void chooseMainIngredient();
}
