package org.designpatterns.structural.decorator;

public class TomatoSauce extends AddOnDecorator {
    public TomatoSauce(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Tomato Sauce";
    }

    @Override
    public double cost() {
        return super.cost() + 1.0;
    }
}
