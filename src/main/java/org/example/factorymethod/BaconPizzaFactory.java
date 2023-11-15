package org.example.factorymethod;

public class BaconPizzaFactory implements PizzaFactory {
    @Override
    public Pizza create() {
        return new BaconPizza();
    }
}
