package home.ylitvinenko;

public class HomeWorkEmployer {


    public static void main(String[] args) {
        factorial (10);
        System.out.println( factorial (10));

    }
    public static int factorial(int n) {
        int result ;
        if (n == 1) {
            return 1;
        }
        result = n + factorial(n-1);
        return result;
    }



}


