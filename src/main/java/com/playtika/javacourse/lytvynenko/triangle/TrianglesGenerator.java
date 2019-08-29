package com.playtika.javacourse.lytvynenko.triangle;

import java.util.concurrent.ThreadLocalRandom;

public class TrianglesGenerator {


    public float getRandomNumber(int bound){

        float randomNumber = (float) ThreadLocalRandom.current().nextDouble(bound);
        return randomNumber;
    }
   public Triangle[] generateArr () {
        Logger.printLog("Генерация 100000 треугольников…");
        Triangle [] arrOfTriangles = new Triangle[1000000];
        for (int i = 0; i < arrOfTriangles.length; i++){
            arrOfTriangles [i] = new Triangle( new Point(getRandomNumber(10),getRandomNumber(10)),new Point(getRandomNumber(10),getRandomNumber(10)), new Point(getRandomNumber(10),getRandomNumber(10)));
        }
       Logger.printLog("Выберите класс треугольника для поиска:");
       Logger.printLog("1. Равнобедренный");
       Logger.printLog("2. Равносторонний");
       Logger.printLog("3. Прямоугольный");
       Logger.printLog("4. Произвольный");

       return arrOfTriangles;


   }


}
