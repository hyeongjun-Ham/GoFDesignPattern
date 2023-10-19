package org.example.decorator.deco;

import org.example.decorator.IDrink;

public class SugarDeco extends DrinkDecorator {
    public SugarDeco(IDrink drink) {
        super(drink);
    }

    @Override
    public void desc() {
        super.desc();
        System.out.println(" SugarDeco " + cost());
    }

    @Override
    public int cost() {
        return super.cost() + 100;
    }
}
