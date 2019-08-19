package com.playtika.javacourse.lytvynenko;

import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write any word to check for polindrom");
        String str = scanner.nextLine();

        char [] arrFromStr = str.toCharArray();
        String str2 = "";

        for (int i = arrFromStr.length-1; i>=0 ;i--)
        {
            str2 += arrFromStr[i];
        }

        if (str.equals(str2))
        {
            System.out.println("Word IS palindrome !");
        }

        else
        {
            System.out.println("Word is NOT palindrome");
        }

    }
}
