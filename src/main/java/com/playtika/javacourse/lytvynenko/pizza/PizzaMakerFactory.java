package com.playtika.javacourse.lytvynenko.pizza;

public interface PizzaMakerFactory {
    AbstractPizzaMaker getPizzaMaker(Button button);
}
