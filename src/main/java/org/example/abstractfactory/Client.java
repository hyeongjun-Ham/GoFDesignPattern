package org.example.abstractfactory;

public class Client {

    public static void main(String[] args) {
        FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
        factoryOfComputerFactory.createComputer("Samsung");
    }

}
