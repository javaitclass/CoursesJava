package com.playtika.javacourse.lytvynenko;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class RandomArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write any number from 10 to 100");
        randomize(new Scanner(System.in).nextInt());

    }

    public static int randomize (int givenNumber)

    {

        if (givenNumber < 10 || givenNumber > 100)
        {
            System.out.println("You entered incorrect number! Please try again");
            return 0;
        }

        int [] arr ;
        arr = new int[givenNumber];
        int result = 0;

        for (int i = 0; i<arr.length; i++)
        {
            arr [i] = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
            result = arr[i];

            if (result % 3 == 0){

                System.out.println(result);
            }

        }
        return result;
    }
}
