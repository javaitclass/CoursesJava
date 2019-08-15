package com.playtika.javacourse.lytvynenko;

public class UnitVector {
    public static void main(String[] args) {
        int x=645;
        int y=100;
        int z=122;
        double lenght = Math.sqrt(x * x + y * y + z * z);
        double onex = x/lenght;
        double oney = y/lenght;
        double onez = z/lenght;
        String s1 = "Единичный вектор для вектора (" + x +","+ y +","+ z +")=>" + "("+ onex+","+oney+","+onez+")";
        System.out.println(s1);
    }
}
