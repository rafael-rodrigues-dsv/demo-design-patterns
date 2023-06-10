package org.example.models;

import org.example.contracts.Car;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }

}
