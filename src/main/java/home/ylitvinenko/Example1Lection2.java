package home.ylitvinenko;

import java.sql.SQLOutput;

public class Example1Lection2 {
    public static void main(String[] args) {
        final float epsilon = 0.00001f;
        float a = 1000.10f;
        float b = 1000.1000001f;

        //System.out.println( (Math.abs(a-b) <= epsilon) );
        System.out.println(Float.compare(a,b));
    }
}
