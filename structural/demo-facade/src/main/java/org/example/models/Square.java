package org.example.models;

import org.example.models.contracts.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
