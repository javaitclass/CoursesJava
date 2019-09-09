package com.playtika.javacourse.lytvynenko.pizza;

public abstract class AbstractPizzaMaker {

    private final String pizzaName;

    protected AbstractPizzaMaker(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String makePizza(){
        takeBlank();
        putIngridients();
        bake();
        slice();
        wrap();

        return pizzaName;
    }

    private void takeBlank() {
        System.out.println("Берём заготовку...");
    }

    protected abstract void putIngridients();

    protected abstract void bake();

    protected abstract void wrap();

    private void slice() {
        System.out.println("Разрезаем на 6 кусочков...");
    }



}
