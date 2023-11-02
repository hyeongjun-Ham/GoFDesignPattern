package org.example.composite;

public class Client {
    public static void main(String[] args) {
        Bag mainBag = new Bag("Main bag");
        Item armor = new Item("Armor", 250);
        Item sword = new Item("Sword", 500);

        mainBag.add(armor);
        mainBag.add(sword);

        Bag foodBag = new Bag("Food bag");
        Item apple = new Item("Apple", 20);
        Item banana = new Item("Banana", 10);
        foodBag.add(apple);
        foodBag.add(banana);

        mainBag.add(foodBag);

        System.out.println("Main bag price: " + mainBag.getPrice());
        System.out.println("Food bag price: " + foodBag.getPrice());
    }
}
