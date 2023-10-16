package org.example.templatemethod;

public class CoffeeMain {
    public static void main(String[] args) {
        IceAmericano iceAmericano = new IceAmericano();
        IceLatte iceLatte = new IceLatte();

        iceAmericano.makeCoffee();
        System.out.println("========================");
        iceLatte.makeCoffee();
    }
}
