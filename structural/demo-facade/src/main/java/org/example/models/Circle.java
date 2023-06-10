package org.example.models;

import org.example.models.contracts.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
