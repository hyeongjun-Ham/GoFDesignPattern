package org.example.decorator;

public class Shake implements IDrink {
    @Override
    public void desc() {
        System.out.println("Shake " + cost());
    }

    @Override
    public int cost() {
        return 3000;
    }
}
