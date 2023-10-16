package org.example.templatecallback;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        game.play(new Strategy() {
            @Override
            public void play() {
                System.out.println("정당한 게임");
            }
        });

        System.out.println("=======================");

        game.play(new Strategy() {
            @Override
            public void play() {
                System.out.println("밑장 빼기");
            }
        });
    }
}
