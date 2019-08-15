package com.playtika.javacourse.lytvynenko;
public class SolvingEquations1 {

    public static void main(String[] args) {
        System.out.println(solvingEquation1(10,20,30,50));
        System.out.println(solvingEquation2(10,20,30,50));
        System.out.println(solvingEquation3(1.1f,2.3f,3.33f,50.55f));
        System.out.println(solvingEquation4(10.11,20.22,30.22,50.11));


    }
    private static long solvingEquation1 (long x,long y, long z, long n)
    {
        long result1= x - ((y + 123) / z) * n;
        return result1;
    }
    private static int solvingEquation2 (int x,int y, int z, int n)
    {
        int result2= (x + (50 - y * z) / n) - x;
        return result2;
    }
    private static float solvingEquation3 (float x,float y, float z, float n)
    {
        float result3 = x / (y * (z - 1) - 564) + n;
        return result3;
    }
    private static double solvingEquation4 (double x,double y, double z, double n)
    {
        double result4 = -x / -y + z / (n + 15);
        return result4;
    }
}



