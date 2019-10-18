package org.improving.domain;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private final String name;
    private final List<Exit> exits;
    private List<Item> items;

    public Location(String name) {
        this.name = name;
        this.exits = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Exit> getExits() {
        return exits;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }


}
