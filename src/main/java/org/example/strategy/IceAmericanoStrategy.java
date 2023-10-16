package org.example.strategy;

public class IceAmericanoStrategy implements Coffee {

    @Override
    public void makeCoffee() {
        System.out.println("시럽을 넣는다.");
    }
}
