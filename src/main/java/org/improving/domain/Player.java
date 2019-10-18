package org.improving.domain;

import java.util.List;

public class Player {
    private String name;
    private int strength;
    private int dexterity;
    private int constitution;
    private Location location;
    private List<Item> items;

    public Player(String name, int strength, int dexterity, int constitution) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }
}
