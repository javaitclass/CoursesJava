package home.ylitvinenko;

import java.util.Arrays;

public class ClassLection3 {
    public static void main(String[] args) {
        int [] number = new int [100];
        int sum = 0;
        for (int i = 0; i<number.length; i++)
        {
            number [i] =number.length - i - 1;
            System.out.println(number[i]);
        }
        for (int i = 0; i<number.length; i++)
        {
            System.out.println(number[i]);
        }
        for (int i = 0; i<number.length; i++)
        {
            sum += number[i];

        }
        System.out.println(sum);


       // System.out.println( Arrays.toString(number));
       // System.out.println(Arrays.fill(number,6));
        for (int nm : number)// for each
        {
            sum += nm;

        }
        System.out.println(sum);
    }
}

// str 1;
//str 2;

//s.1.equals(s2);

//StringBuilder sb = new StringBuilder();
//sb.append
//.append
//.ToString