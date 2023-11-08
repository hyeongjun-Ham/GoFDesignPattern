package org.example.abstractfactory;

public class Client {

    public static void main(String[] args) {

        ComputerFactory computerFactory = new LGComputerFactory();
        computerFactory.createKeyBoard();
        computerFactory.createMouse();
    }

}
