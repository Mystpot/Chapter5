package com.gareth;

// Visitor

public class Parent implements VisitorInt {

    private String name;
    private String surname;
    private int age;

    public Parent()
    {

    }

    public Parent(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public int getAge()
    {
        return age;
    }

    public String accept(TeacherVisitor visitor)
    {
        return visitor.visit(this);
    }

}
