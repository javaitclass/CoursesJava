package com.playtika.javacourse.lytvynenko.triangle;

import static java.lang.Math.*;

public class MathOperator {
    public static float rounding (float number){
        number = (float)((int)( number *10f ))/10f;
        return number;

    }

    private static float toPow (float number, int pow){
        float result = (float) Math.pow(number, pow);
        return rounding(result);
    }

    public  static boolean calculatePythTheorem ( float a, float b, float c){

     if((Float.compare((float) toPow(a,2), ((float) toPow(b,2) + (float) toPow(c,2))) == 0) ||
             (Float.compare((float) toPow(b,2), ((float) toPow(a,2) + (float)toPow(c,2))) == 0) ||
             (Float.compare((float) toPow(c,2), ((float) toPow(a,2) + (float) toPow(b,2))) == 0)) {
         return true;
     }
        return false;
         }

    }

