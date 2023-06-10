package org.example.models;

import org.example.models.contracts.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
