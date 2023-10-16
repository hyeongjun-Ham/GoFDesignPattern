package org.example.strategy.example2;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        game.setStrategy(new NoCheat());
        game.play();

        System.out.println("=======================");

        game.setStrategy(new Cheat());
        game.play();
    }
}
