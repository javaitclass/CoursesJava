package com.playtika.javacourse.lytvynenko.pizza;

public class PoloPizzaMaker extends AbstractPizzaMaker {
    public PoloPizzaMaker() {
        super("Polo");
    }

    @Override
    protected void putIngridients() {
        System.out.println("Кладём прошутто, колбасу, сыр мацарелла");
    }

    @Override
    protected void bake()  {
        System.out.println("Выпекаем пиццу");
        try {
            Thread.sleep(13000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void wrap() {
        System.out.println("Запаковать Поло");

    }
}
