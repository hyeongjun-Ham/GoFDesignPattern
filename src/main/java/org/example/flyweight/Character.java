package org.example.flyweight;

public class Character {

    private final char value;

    private final String color;

    private final Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }

    public Character(char value, String color, String fontFamily, int fontSize) {
        this.value = value;
        this.color = color;
        this.font = new Font(fontFamily, fontSize);
    }

    public Font getFont() {
        return font;
    }


}
