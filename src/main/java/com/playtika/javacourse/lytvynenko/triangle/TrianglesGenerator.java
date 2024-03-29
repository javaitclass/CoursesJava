
package com.playtika.javacourse.lytvynenko.triangle;

import java.util.concurrent.ThreadLocalRandom;

public class TrianglesGenerator {
    public float getRandomNumber(int bound){

        float randomNumber = (float) ThreadLocalRandom.current().nextDouble(bound);
        return randomNumber;
    }
    public Triangle[] generateArr () {
        Logger.printLog("Генерация 100000 треугольников…");
        Triangle [] arrOfTriangles = new Triangle[100000];
        int i = 0;
        while (i < arrOfTriangles.length){
            arrOfTriangles [i] = new Triangle( new Point(getRandomNumber(10),getRandomNumber(10)),new Point(getRandomNumber(10),getRandomNumber(10)), new Point(getRandomNumber(10),getRandomNumber(10)));
            if ((arrOfTriangles[i].square() > 0)) {
                i++;
            }
        }
        Logger.printLog("Выберите класс треугольника для поиска:");
        Logger.printLog("1. Равнобедренный");
        Logger.printLog("2. Равносторонний");
        Logger.printLog("3. Прямоугольный");
        Logger.printLog("4. Произвольный");

        return arrOfTriangles;
    }
}