package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Bag implements IItemComponent{

    private final String name;
    List<IItemComponent> components;

    public Bag(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void add(IItemComponent component) {
        components.add(component);
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(IItemComponent::getPrice).sum();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
