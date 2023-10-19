package org.example.decorator.deco;

import org.example.decorator.IDrink;

public abstract class DrinkDecorator implements IDrink {

    private IDrink drink;

    public DrinkDecorator(IDrink drink) {
        this.drink = drink;
    }

    @Override
    public void desc() {
        drink.desc();
    }

    @Override
    public int cost() {
        return drink.cost();
    }
}
