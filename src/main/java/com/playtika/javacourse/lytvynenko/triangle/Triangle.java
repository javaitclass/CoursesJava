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
        perimeter = Round.rounding(perimeter);
        return perimeter;
    }

    float square() {
        float halfPerimeter = perimeter() / 2;
        float square = (float) Math.sqrt(halfPerimeter * (halfPerimeter - a.distance(b)) * (halfPerimeter - b.distance(c)) * (halfPerimeter - a.distance(c)));
        square = Round.rounding(square);
        return square;
    }

   @Override
    public String toString() {
        return "Треугольник [a" + getPointA() + " b" + getPointB() + " c" + getPointC()+ "]";
    }

    String type() {
        if (isIsosceles()){
            return "Равносторонний";
        } else if(isEquilateral()){
            return "Равнобедренный";
        } else if (isRectangular()){
            return "Прямоугольный";
        }
        return "Произвольный";
    }

    private boolean isIsosceles (){
        if (Float.compare(a.distance(b), b.distance(c)) == 0 & (Float.compare(a.distance(b), a.distance(c)) == 0)) {
            return true;
        } else{
            return false;
        }
    }

    private boolean isEquilateral (){
        if (Float.compare(a.distance(b), b.distance(c)) == 0 || (Float.compare(a.distance(b), a.distance(c)) == 0) || (Float.compare(a.distance(c), c.distance(b)) == 0)) {
            return true;
        } else{
            return false;
        }
    }

    private boolean isRectangular (){
        if ((Float.compare((float) Math.pow(a.distance(b), 2), ((float) Math.pow(a.distance(c), 2) + (float) Math.pow(b.distance(c), 2))) == 0) || (Float.compare((float) Math.pow(a.distance(c), 2), ((float) Math.pow(a.distance(b), 2) + (float) Math.pow(b.distance(c), 2))) == 0) || (Float.compare((float) Math.pow(b.distance(c), 2), ((float) Math.pow(a.distance(b), 2) + (float) Math.pow(a.distance(c), 2))) == 0)) {
            return true;
        } else{
            return false;
        }
    }
}
