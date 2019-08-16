package com.playtika.javacourse.lytvynenko;

import java.util.Scanner;

public class HomeWorkEmployer {


    public static void main(String[] args) {
        System.out.println("Please enter number of employees for the moment");
        System.out.println(interviewCount(new Scanner(System.in).nextInt() - 1));

    }

    public static int interviewCount(int n) {
        if (n == 1) {

            return 1;

        } else if (n <= 0) {

            return 0;
        }
        int result;
        result = n + interviewCount((n - 1));
        return result;
    }


}


