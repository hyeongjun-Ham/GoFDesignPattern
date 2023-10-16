package org.example.strategy.example2;

public class Cheat implements Strategy {
    @Override
    public void play() {
        System.out.println("밑장빼기");
    }
}
