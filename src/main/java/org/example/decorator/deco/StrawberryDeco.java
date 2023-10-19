package org.example.decorator.deco;

import org.example.decorator.IDrink;

public class StrawberryDeco extends DrinkDecorator {
    public StrawberryDeco(IDrink drink) {
        super(drink);
    }

    @Override
    public void desc() {
        super.desc();
        System.out.println(" StrawberryDeco " + cost());
    }

    @Override
    public int cost() {
        return super.cost() + 500;
    }
}
