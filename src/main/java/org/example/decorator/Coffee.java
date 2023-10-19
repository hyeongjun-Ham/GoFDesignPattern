package org.example.decorator;

public class Coffee implements IDrink {
    @Override
    public void desc() {
        System.out.println("Coffee");
    }

    @Override
    public int cost() {
        return 2000;
    }
}
