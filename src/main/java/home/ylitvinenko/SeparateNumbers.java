package home.ylitvinenko;

public class SeparateNumbers {
    public static void main(String[] args) {
       separate(97852);
    }

    public static int separate (int number)
    {
        int result = number/10000;
        System.out.println(result);

        number = number%10000;
        result = number /1000;
        System.out.println(result);

        number = number%1000;
        result = number /100;
        System.out.println(result);

        number = number%100;
        result = number /10;
        System.out.println(result);

        number = number%10;
        result = number;
        System.out.println(result);

        return result;
    }
}