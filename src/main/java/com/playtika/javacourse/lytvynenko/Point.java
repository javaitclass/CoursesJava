package com.playtika.javacourse.lytvynenko;
public class Point {

    private float x;
    private float y;
    private float distance;

    public float distance(Point pointFrom, Point pointTo) {
        this.x = pointFrom.x - pointTo.x;
        this.y = pointFrom.y - pointTo.y;
        distance = (float) Math.sqrt((this.x * this.x) + (this.y*this.y));
        System.out.println(distance);
        return distance;
    }

    public static void main(String[] args) {
    }

}
