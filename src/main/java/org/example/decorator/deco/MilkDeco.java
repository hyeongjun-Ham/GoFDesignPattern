package org.example.decorator.deco;

import org.example.decorator.IDrink;

public class MilkDeco extends DrinkDecorator {
    public MilkDeco(IDrink drink) {
        super(drink);
    }

    @Override
    public void desc() {
        super.desc();
        System.out.println(" MilkDeco " + cost());
    }

    @Override
    public int cost() {
        return super.cost() + 300;
    }
}
