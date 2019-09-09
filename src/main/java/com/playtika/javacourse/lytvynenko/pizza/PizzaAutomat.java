package com.playtika.javacourse.lytvynenko.pizza;

public class PizzaAutomat {
    public static void main(String[] args) {
        UkrainePizzaMakerFactory factory = new UkrainePizzaMakerFactory();
        //PizzaMakerFactory factory = new DneprPizzaMakerFactory;
        String pizza = factory.getPizzaMaker(Button.A).makePizza();
        System.out.println(pizza);
        String pizza1 = factory.getPizzaMaker(Button.B).makePizza();
        System.out.println(pizza1);
        String pizza2 = factory.getPizzaMaker(Button.C).makePizza();
        System.out.println(pizza2);

    }
}
