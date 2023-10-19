package org.example.decorator;

import org.example.decorator.deco.IceDeco;
import org.example.decorator.deco.MilkDeco;
import org.example.decorator.deco.StrawberryDeco;
import org.example.decorator.deco.SugarDeco;

public class DrinkBuilder {

    private IDrink drink;

    DrinkBuilder addCoffee() {
        drink = new Coffee();
        return this;
    }

    public DrinkBuilder addShake() {
        drink = new Shake();
        return this;
    }

    public DrinkBuilder addIce() {
        drink = new IceDeco(drink);
        return this;
    }

    public DrinkBuilder addSugar() {
        drink = new SugarDeco(drink);
        return this;
    }

    public DrinkBuilder addMilk() {
        drink = new MilkDeco(drink);
        return this;
    }

    public DrinkBuilder addStrawberry() {
        drink = new StrawberryDeco(drink);
        return this;
    }

    public IDrink build() {
        return drink;
    }
}
