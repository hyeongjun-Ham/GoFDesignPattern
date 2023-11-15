package org.example.factorymethod;

public abstract class Pizza {

    protected Integer price;
    protected PizzaType type;

    public void print() {
        System.out.println("이 피자는 " + type.name() + "피자이며 가격은 " + price + "원 입니다.");
    }
}
