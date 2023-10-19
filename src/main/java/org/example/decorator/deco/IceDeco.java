package org.example.decorator.deco;

import org.example.decorator.IDrink;

public class IceDeco extends DrinkDecorator {


    public IceDeco(IDrink drink) {
        super(drink);
    }

    @Override
    public void desc() {
        super.desc();
        System.out.println(" IceDeco " + cost());
    }

    @Override
    public int cost() {
        return super.cost() + 200;
    }
}
