package org.example.decorator;

import org.example.decorator.deco.IceDeco;
import org.example.decorator.deco.MilkDeco;

public class Client {
    public static void main(String[] args) {

        //안에서 밖으로 감싸진다.
        IDrink test = new Coffee();
        IDrink testDrink = new IceDeco(new MilkDeco(test));
        testDrink.desc();
        testDrink.cost();


        //Builder 구현 시
        System.out.println("# Ice Latte");
        DrinkBuilder drinkBuilder = new DrinkBuilder();
        IDrink iceLatte = drinkBuilder.addCoffee().addMilk().addIce().build();
        iceLatte.desc();
        System.out.println(" = Cost: " + iceLatte.cost());

        System.out.println("\n# Strawberry Shake");
        IDrink strawberryShake = drinkBuilder.addShake().addStrawberry().addMilk().addIce().addSugar().build();
        strawberryShake.desc();
        System.out.println(" = Cost: " + strawberryShake.cost());

    }
}
