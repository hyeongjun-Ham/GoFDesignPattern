package org.example.factorymethod;

public class BaconPizza extends Pizza {
    protected BaconPizza() {
        this.price = 10000;
        this.type = PizzaType.BACON;
    }
}
