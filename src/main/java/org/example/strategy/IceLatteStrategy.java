package org.example.strategy;

public class IceLatteStrategy implements Coffee {

    @Override
    public void makeCoffee() {
        System.out.println("우유를 넣는다.");
    }
}
