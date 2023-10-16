package org.example.strategy.example2;

public class NoCheat implements Strategy {
    @Override
    public void play() {
        System.out.println("정당한 게임");
    }
}
