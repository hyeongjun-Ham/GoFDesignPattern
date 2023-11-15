package org.example.factorymethod;

public class Client {
    public static void main(String[] args) {
        PizzaFactory cheesePizzaFactory = new CheesePizzaFactory();
        PizzaFactory baconPizzaFactory= new BaconPizzaFactory();
        PizzaFactory seafoodPizzaFactory = new SeafoodPizzaFactory();

        Pizza cheesePizza = cheesePizzaFactory.create();
        Pizza baconPizza = baconPizzaFactory.create();
        Pizza seafoodPizza = seafoodPizzaFactory.create();

        cheesePizza.print();
        baconPizza.print();
        seafoodPizza.print();
    }
}
