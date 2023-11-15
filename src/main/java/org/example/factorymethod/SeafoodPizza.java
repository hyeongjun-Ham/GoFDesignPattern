package org.example.factorymethod;

public class SeafoodPizza extends Pizza {
    protected SeafoodPizza() {
        this.price = 15000;
        this.type = PizzaType.SEAFOOD;
    }
}
