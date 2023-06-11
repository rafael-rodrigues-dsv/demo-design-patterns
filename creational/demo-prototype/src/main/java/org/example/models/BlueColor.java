package org.example.model;

public class BlueColor extends Color
{
    public BlueColor()
    {
        this.colorName = "blue";
    }

    @Override
    public void addColor()
    {
        System.out.println("Blue color added");
    }
}
