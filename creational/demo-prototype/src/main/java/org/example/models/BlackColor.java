package org.example.models;

public class BlackColor extends Color {

    public BlackColor()
    {
        this.colorName = "black";
    }

    @Override
    public void addColor()
    {
        System.out.println("Black color added");
    }
}
