package org.example.strategy.example1;

public class CoffeeMaker {

    private Coffee coffee;

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public void makeCoffee() {
        boilWater();
        putEspresso();
        putIce();
        coffee.makeCoffee();
    }

    private void boilWater() {
        System.out.println("물을 끓인다.");
    }

    private void putEspresso() {
        System.out.println("끓는 물에 에스프레소를 넣는다.");
    }

    private void putIce() {
        System.out.println("얼음을 넣는다.");
    }
}
