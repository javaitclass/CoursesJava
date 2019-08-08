package home.ylitvinenko;

public class FindOpposite {


    public static void main(String[] args) {

        int a = -220;
        if (a > 0) {

            a = a-a-a;
            System.out.println(a);

        } else if (a < 0) {

          System.out.println(Math.abs(a));

       } else if (a == 0) {

            System.out.println(a);

        }



    }


}