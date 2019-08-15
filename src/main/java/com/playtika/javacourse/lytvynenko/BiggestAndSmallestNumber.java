package com.playtika.javacourse.lytvynenko;

public class BiggestAndSmallestNumber {
    public static void main(String[] args) {

        long given = 283230733;
        long resultTemp = 0;
        long resultSmall = given%10;
        long resultBig = given%10;

        do {
            resultTemp = given%10;
            if (resultTemp >= resultBig )
            {
                resultBig = resultTemp;
            }
            else if (resultTemp < resultSmall)
            {
                resultSmall = resultTemp;
            }

            given  = (given - resultTemp)/10;

        } while (given > 0);

        System.out.println("The smallest number " + resultSmall);
        System.out.println("The biggest number " + resultBig);
    }
}
