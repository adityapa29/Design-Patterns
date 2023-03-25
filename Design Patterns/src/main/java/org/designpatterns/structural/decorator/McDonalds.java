package org.designpatterns.structural.decorator;

public class McDonalds {
    public static void main(String[] args) {
        Burger burger = new McAlooTikki();
        burger = new Cheese(burger);
        burger = new Cheese(burger);
        burger = new TomatoSauce(burger);

        System.out.println("Burger Description - "+burger.getDescription());
        System.out.println("Price - "+burger.cost());
    }
}
