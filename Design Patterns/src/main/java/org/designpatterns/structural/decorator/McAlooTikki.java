package org.designpatterns.structural.decorator;

public class McAlooTikki implements Burger {
    @Override
    public String getDescription() {
        return "McAloo Tikki Burger";
    }

    @Override
    public double cost() {
        return 52.0;
    }
}
