package home.ylitvinenko;

public class Persist {
    public static int persistence(long n) {
        n = 999;
        int result = 1;

        for (int i = 10; i > 0; i*=10){
            result *= n%i;
        }

        return result;
    }
}
