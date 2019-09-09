package com.playtika.javacourse.lytvynenko.pizza;

public class UkrainePizzaMakerFactory implements PizzaMakerFactory{
    public AbstractPizzaMaker getPizzaMaker(Button button){
        switch (button){
            case A: return new CarbonarPizzaMaker();
            case B:  return new FourCheesesPizzaMaker();
            case C:return new PeperoniPizzaMaker();
            case D: return new PoloPizzaMaker();
        }
        return null;
    }
}
