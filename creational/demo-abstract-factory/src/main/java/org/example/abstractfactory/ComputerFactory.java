package org.example.abstractfactory;

import org.example.abstractfactory.contracts.ComputerAbstractFactory;
import org.example.model.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
