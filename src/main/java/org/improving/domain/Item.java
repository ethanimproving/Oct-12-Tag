package org.improving.domain;

public class Item {
    private final String name;
    private final int strength;
    private final int dexterity;
    private final int constitution;

    public Item(String name, int strength, int dextarity, int constitution) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dextarity;
        this.constitution = constitution;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }
}
