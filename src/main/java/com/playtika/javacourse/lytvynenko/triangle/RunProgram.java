package com.playtika.javacourse.lytvynenko.triangle;

public class RunProgram {
    public static void main(String[] args) {
        Point a = new Point(2.2f,1.1f);
        Point b = new Point(7.4f, 2.2f);
        Point c = new Point(9.2f, 7.6f);

        Triangle triangle = new Triangle(a, b, c);


        System.out.println(triangle.perimeter());
        System.out.println(triangle.square());
    }
}
