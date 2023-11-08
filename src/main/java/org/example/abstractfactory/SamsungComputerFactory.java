package org.example.abstractfactory;

public class SamsungComputerFactory implements ComputerFactory{
    @Override
    public void createKeyBoard() {
        new SamsungKeyBoard();
    }

    @Override
    public void createMouse() {
        new SamsungMouse();
    }
}
