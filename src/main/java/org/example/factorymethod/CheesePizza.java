package org.example.factorymethod;

public class CheesePizza extends Pizza {
    protected CheesePizza() {
        this.price = 8000;
        this.type = PizzaType.CHEESE;
    }
}
