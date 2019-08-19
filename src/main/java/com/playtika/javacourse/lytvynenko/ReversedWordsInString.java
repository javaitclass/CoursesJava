package com.playtika.javacourse.lytvynenko;

import java.util.Scanner;

public class ReversedWordsInString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write any text - all words will be flipped");
        String str = scanner.nextLine();
        String splittedStr[] = str.split(" ");

        String result = "";
        String temp = "";

        for ( int i = 0 ;i <splittedStr.length; i++)
        {
            temp = splittedStr[i]+ " ";

            char [] arrFromTemp = temp.toCharArray();
            for (int j = arrFromTemp.length-1; j>=0 ;j--)
            {


                result += arrFromTemp[j] ;

            }
        }

        System.out.println(result.trim());

    }
}