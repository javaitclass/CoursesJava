package com.playtika.javacourse.lytvynenko.pizza;

public class PeperoniPizzaMaker extends AbstractPizzaMaker {
    public PeperoniPizzaMaker() {
        super("Peperoni");
    }

    @Override
    protected void putIngridients() {
        System.out.println("Кладём колбасу пеперони, макароны");
    }

    @Override
    protected void bake()  {
        System.out.println("Выпекаем пиццу");
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void wrap() {
        System.out.println("Запаковать Пеперони");

    }
}
