package com.playtika.javacourse.lytvynenko.pizza;

public class CarbonarPizzaMaker extends AbstractPizzaMaker {
    public CarbonarPizzaMaker() {
        super("Carbonara");
    }

    @Override
    protected void putIngridients() {
        System.out.println("Кладём колбасу, сыр, майонез, яйца");

    }

    @Override
    protected void bake()  {
        System.out.println("Выпекаем пиццу");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void wrap() {
        System.out.println("Запаковать Карбонара");


    }
}
