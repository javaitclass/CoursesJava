package home.ylitvinenko;

public class SumOfNumerals {
    public static void main(String[] args) {
        System.out.println(sum(987244821));

    }
    public static long sum (int given)
    {
        long result = 0;
        long x = given;
        long resulttemp = 0;
        for (int i = 10; x>10;)
        {
            result += x%10;
            resulttemp = x%10;
            x  = (x - resulttemp)/10;
        }
        result += x;
        return result;
    }
}