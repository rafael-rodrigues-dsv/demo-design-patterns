package org.example.models;

import org.example.decorators.CarDecorator;
import org.example.contracts.Car;

public class SportsCar extends CarDecorator {

    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}
