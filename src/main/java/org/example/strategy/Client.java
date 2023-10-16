package org.example.strategy;

public class Client {

    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.setCoffee(new IceAmericanoStrategy());
        coffeeMaker.makeCoffee();

        System.out.println("======================");

        coffeeMaker.setCoffee(new IceLatteStrategy());
        coffeeMaker.makeCoffee();

    }

}
