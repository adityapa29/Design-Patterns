package org.designpatterns.structural.decorator;

public class Cheese extends AddOnDecorator {
    public Cheese(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double cost() {
        return super.cost() + 24.0;
    }
}
