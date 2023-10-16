package org.example.strategy.example1;

public class IceLatteStrategy implements Coffee {

    @Override
    public void makeCoffee() {
        System.out.println("우유를 넣는다.");
    }
}
