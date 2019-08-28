package com.playtika.javacourse.lytvynenko.triangle;
public class Point {

    private float x;
    private float y;

    public Point (float x , float y){
        this.x = Math.round(x*10)/10;
        this.y = Math.round(y*10)/10;
    }

    public float distance(Point pointTo) {
        float distance = (float) Math.sqrt((float)Math.pow(this.x - pointTo.x, 2) + (float)Math.pow(this.y - pointTo.y, 2));
        return distance;
    }



}
