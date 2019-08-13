package home.ylitvinenko;
public class SolvingEquations1 {

    public static void main(String[] args) {
        System.out.println(solvingEquation1(10,20,30,50));
        System.out.println(solvingEquation2(10,20,30,50));
        System.out.println(solvingEquation3(10,20,30,50));
        System.out.println(solvingEquation4(10,20,30,50));


    }
    public static long solvingEquation1 (int x,int y, int z, int n)
    {
        long result1= x - ((y + 123) / z) * n;
        return result1;
    }
    public static int solvingEquation2 (int x,int y, int z, int n)
    {
        int result2= (x + (50 - y * z) / n) - x;
        return result2;
    }
    public static float solvingEquation3 (int x,int y, int z, int n)
    {
        float result3 = x / (y * (z - 1) - 564) + n;
        return result3;
    }
    public static double solvingEquation4 (int x,int y, int z, int n)
    {
        double result4 = -x / -y + z / (n + 15);
        return result4;
    }
}



