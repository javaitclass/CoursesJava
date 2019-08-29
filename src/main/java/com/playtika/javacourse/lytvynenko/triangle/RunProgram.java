package com.playtika.javacourse.lytvynenko.triangle;

import java.util.Scanner;

public class RunProgram {
    public static void main(String[] args) {
        TrianglesGenerator trianglesGenerator = new TrianglesGenerator();
        Triangle[] arr = trianglesGenerator.generateArr();
        Scanner scanner = new Scanner(System.in);
        int classOfTriangle = scanner.nextInt();
        printInfoOfTriangle(arr, classOfTriangle);
    }
    public static void printInfoOfTriangle(Triangle[] arr, int classOfTriangle) {
        switch (classOfTriangle) {
            case 1:
                infoOfTriangle(arr, "Равнобедренный");
                break;
            case 2:
                infoOfTriangle(arr, "Равносторонний");
                break;
            case 3:
                infoOfTriangle(arr, "Прямоугольный");
                break;
            case 4:
                infoOfTriangle(arr, "Произвольный");
                break;
            default:
                System.out.println("Неправильно указан тип треуголтника, выберите один из данных типов(1-4");
                break;
        }
    }
    public static void infoOfTriangle(Triangle[] arr, String inputType) {
        for(int i = 0; i<arr.length; i++)
        {
            if(inputType.equals(arr[i].type()) & arr[i].square()> 0 ) {
                System.out.println("Найден " + inputType + " треугольник");
                System.out.println("Индекс: " + i);
                System.out.println("Треугольник " +
                        "[a(" + arr[i].getPointA().getX() + ";" + arr[i].getPointA().getY() + ") " +
                        "b(" + arr[i].getPointB().getX() + ";" + arr[i].getPointB().getY() + ") " +
                        "c(" + arr[i].getPointC().getX() + ";" + arr[i].getPointC().getY() + ")");
                System.out.println("Периметр: " + arr[i].perimeter());
                System.out.println("Площадь: " + arr[i].square());
                break;
            }
        }
    }
}
