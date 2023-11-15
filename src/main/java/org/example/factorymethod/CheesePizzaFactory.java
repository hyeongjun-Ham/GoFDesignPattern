package org.example.factorymethod;

public class CheesePizzaFactory implements PizzaFactory {

    @Override
    public Pizza create() {
        return new CheesePizza();
    }
}
