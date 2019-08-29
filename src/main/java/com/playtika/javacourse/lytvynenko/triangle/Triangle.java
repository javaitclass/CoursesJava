package com.playtika.javacourse.lytvynenko.triangle;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getPointA() {
        return a;
    }

    public Point getPointB() {
        return b;
    }

    public Point getPointC() {
        return c;
    }

    float perimeter() {
        float perimeter = a.distance(b) + b.distance(c) + a.distance(c);
        return perimeter;
    }

    float square() {
        float halfPerimeter = perimeter() / 2;
        float square = (float) Math.sqrt(halfPerimeter * (halfPerimeter - a.distance(b)) * (halfPerimeter - b.distance(c)) * (halfPerimeter - a.distance(c)));
        Math.round(square);
        return square;
    }

    String type() {
        String type;
        if (Float.compare(a.distance(b), b.distance(c)) == 0) {
            if (Float.compare(a.distance(b), a.distance(c)) == 0) {
                return "Равносторонний";
            } else {
                return "Равнобедренный";
            }
        } else if ((Float.compare(a.distance(c), b.distance(c)) == 0)) {
            return "Равнобедренный";
        } else if ((Float.compare(a.distance(b), a.distance(c)) == 0)) {
            return "Равнобедренный";
        } else if ((Float.compare((float) Math.pow(a.distance(b), 2), ((float) Math.pow(a.distance(c), 2) + (float) Math.pow(b.distance(c), 2))) == 0)) {
            return "Прямоугольный";
        } else if ((Float.compare((float) Math.pow(a.distance(c), 2), ((float) Math.pow(a.distance(b), 2) + (float) Math.pow(b.distance(c), 2))) == 0)) {
            return "Прямоугольный";
        } else if ((Float.compare((float) Math.pow(b.distance(c), 2), ((float) Math.pow(a.distance(b), 2) + (float) Math.pow(a.distance(c), 2))) == 0)) {
            return "Прямоугольный";
        }
        return "Произвольный";
    }

}
