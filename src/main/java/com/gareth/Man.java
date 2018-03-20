package com.gareth;

// Prototype

public class Man implements Person {

    public Man()
    {

    }

    public Person createClone() {

        Man man = null;
        try {
            man = (Man) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return man;
    }

    public Person getClone(Person newMan)
    {
        return newMan.createClone();
    }
    public String toString()
    {
        return "This is a new man!";
    }
}
