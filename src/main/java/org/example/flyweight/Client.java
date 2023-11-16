package org.example.flyweight;

public class Client {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('e', "white", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('i', "white", fontFactory.getFont("nanum:12"));

        System.out.println(c1.getFont());
        System.out.println(c2.getFont());
        System.out.println(c3.getFont());

        Character c4 = new Character('h', "white", "nanum", 12);
        Character c5 = new Character('h', "white", "nanum", 12);
        Character c6 = new Character('h', "white", "nanum", 12);

        System.out.println(c4.getFont());
        System.out.println(c5.getFont());
        System.out.println(c6.getFont());
    }
}
