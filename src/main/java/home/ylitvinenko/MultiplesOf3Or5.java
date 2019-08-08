package home.ylitvinenko;

public class MultiplesOf3Or5 {
    public static void main(String[] args) {
        solution(10);
        System.out.println (solution(10));
    }

    public static int solution(int number) {
        int a = number;
        int result = 0;
        int c =0;
        for (int i = 1; i <a; i++) {
            int b = i % 3;
            if (b == 0) {
                result = result + i;
            } else
            if ((c = i % 5) == 0) {
                result = result + i;


            }


        }

        return result;


    }
}