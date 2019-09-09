package com.playtika.javacourse.lytvynenko.pizza;

public class FourCheesesPizzaMaker extends AbstractPizzaMaker {
    public FourCheesesPizzaMaker() {
        super("Four Cheeses");
    }

    @Override
    protected void putIngridients() {
        System.out.println("Кладём черед, пармезан, дорблю, российский");
    }

    @Override
    protected void bake()  {
        System.out.println("Выпекаем пиццу");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void wrap() {
        System.out.println("Запаковать четыре сыра");

    }
}
