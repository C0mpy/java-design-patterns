package com.compi.composite;

import java.util.ArrayList;

public abstract class MenuComponent {

    String name;
    String url;
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();

    public MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(menuComponent.getName());
        builder.append(": ");
        builder.append(menuComponent.getUrl());
        builder.append("\n");
        return builder.toString();
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();
}
