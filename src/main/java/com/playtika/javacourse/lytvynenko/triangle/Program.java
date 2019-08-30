package com.playtika.javacourse.lytvynenko.triangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        TrianglesGenerator trianglesGenerator = new TrianglesGenerator();
        Triangle[] arr = trianglesGenerator.generateArr();
        Scanner scanner = new Scanner(System.in);
        int classOfTriangle = scanner.nextInt();
        Program print = new Program();
        print.printInfoOfTriangle(arr, classOfTriangle);
        Program count = new Program();
        count.countTypesOfTriangles(arr);
    }

    public  void printInfoOfTriangle(Triangle[] arr, int classOfTriangle) {
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
                System.out.println("Неправильно указан тип треугольника, выберите один из данных типов(1-4)");
                break;
        }
    }

    public  void infoOfTriangle(Triangle[] arr, String inputType) {
        for(int i = 0; i<arr.length; i++)
        {
            if(inputType.equals(arr[i].type()) & arr[i].square() > 0) {
                System.out.println("Найден " + inputType + " треугольник");
                System.out.println("Индекс: " + i);
                System.out.println(arr[i]);
                System.out.println("Периметр: " + arr[i].perimeter());
                System.out.println("Площадь: " + arr[i].square());
                break;
            }
        }
    }

    public  void countTypesOfTriangles (Triangle[] arr) {
        int countIsosceles = 0;
        int countEquilateral = 0;
        int countRectangular = 0;
        int countArbitrary = 0;
        for(int i = 0; i<arr.length; i++) {
            switch (arr[i].type()){

                case "Равнобедренный":
                    countIsosceles ++;
                    break;
                case "Равносторонний":
                    countEquilateral++;
                    break;
                case "Прямоугольный":
                    countRectangular++;
                    break;
                case "Произвольный":
                    countArbitrary++;
                    break;
            }
        }
        System.out.println("Количество равнобедренных треугольников: " + countIsosceles);
        System.out.println("Количество равносторонних треугольников: " + countEquilateral);
        System.out.println("Количество прямоугольных треугольников: " + countRectangular);
        System.out.println("Количество произвольных треугольников: " + countArbitrary);
    }
}
