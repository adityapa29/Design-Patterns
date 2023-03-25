package org.designpatterns.structural.decorator;

public abstract class AddOnDecorator implements Burger {
    protected Burger burger;

    public AddOnDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription();
    }

    @Override
    public double cost() {
        return burger.cost();
    }
}
