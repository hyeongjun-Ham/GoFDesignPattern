package org.example.factorymethod;

public class SeafoodPizzaFactory implements PizzaFactory {
    @Override
    public Pizza create() {
        return new SeafoodPizza();
    }
}
