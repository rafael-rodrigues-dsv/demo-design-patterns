package org.example.factories;

import org.example.models.Computer;
import org.example.models.PC;
import org.example.models.Server;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}
