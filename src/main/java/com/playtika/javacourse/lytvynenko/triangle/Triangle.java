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

    public float getSideAB(){
        return Round.rounding(a.distance(b));
    }

    public float getSideAC(){
        return Round.rounding(a.distance(c));
    }

    public float getSideBC(){
        return Round.rounding(b.distance(c));
    }

   public float perimeter() {
        float perimeter = getSideAB() + getSideAC() + getSideBC();
        perimeter = Round.rounding(perimeter);
        return perimeter;
    }

    public float square() {
        float halfPerimeter = perimeter() / 2;
        float square = (float) Math.sqrt(halfPerimeter * (halfPerimeter - getSideAB()) * (halfPerimeter - getSideBC()) * (halfPerimeter - getSideAC()));
        square = Round.rounding(square);
        return square;
    }

   @Override
    public String toString() {
        return "Треугольник [a" + getPointA() + " b" + getPointB() + " c" + getPointC()+ "]";
    }

    public String type() {
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
        if (Float.compare(getSideAB(), getSideBC()) == 0 &
                (Float.compare(getSideAB(), getSideAC()) == 0)) {
            return true;
        }
            return false;
    }

    private boolean isEquilateral (){
        if (Float.compare(getSideAB(), getSideBC()) == 0 ||
                (Float.compare(getSideAB(), getSideAC()) == 0) ||
                (Float.compare(getSideAC(), getSideBC()) == 0)) {
            return true;
        }
            return false;
    }

    private boolean isRectangular (){
        if ((Float.compare((float) Math.pow(getSideAB(), 2), ((float) Math.pow(getSideAC(), 2) + (float) Math.pow(getSideBC(), 2))) == 0) ||
                (Float.compare((float) Math.pow(getSideAC(), 2), ((float) Math.pow(getSideAB(), 2) + (float) Math.pow(getSideBC(), 2))) == 0) ||
                (Float.compare((float) Math.pow(getSideBC(), 2), ((float) Math.pow(getSideAB(), 2) + (float) Math.pow(getSideAC(), 2))) == 0)) {
            return true;
        }
            return false;
    }
}
