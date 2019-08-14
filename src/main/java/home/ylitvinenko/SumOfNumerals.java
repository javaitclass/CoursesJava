package home.ylitvinenko;

public class SumOfNumerals {
    public static void main(String[] args) {
        System.out.println(sum(678783443));

    }
    public static long sum (int given)
    {
        long result = 0;
        long x = given;
        long resulttemp = 0;
        do {
            result += x%10;
            resulttemp = x%10;
            x  = (x - resulttemp)/10;
        } while (x>10);

        result += x;
        return result;
    }
}