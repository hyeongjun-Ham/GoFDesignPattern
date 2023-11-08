package org.example.abstractfactory;

public class SamsungComputerFactory implements ComputerFactory{
    @Override
    public KeyBoard createKeyBoard() {
        return new SamsungKeyBoard();
    }

    @Override
    public Mouse createMouse() {
        return new SamsungMouse();
    }
}
