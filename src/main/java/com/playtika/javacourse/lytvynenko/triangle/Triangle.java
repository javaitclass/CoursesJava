package com.playtika.javacourse.lytvynenko.triangle;

import static java.lang.Math.sqrt;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    float perimeter() {
      float perimeter = a.distance(b) + b.distance(c) + a.distance(c);
      return perimeter;
    }
    float square(){
        float halfPerimeter = perimeter()/2;
        float square = (float) Math.sqrt(halfPerimeter * (halfPerimeter -a.distance(b)) * (halfPerimeter -b.distance(c)) * (halfPerimeter -a.distance(c)));
        return square;
    }
    String type(){
        if((b.distance(c) c.distance(a)) == a.distance(b) {

        }

        return "";
    }

}
