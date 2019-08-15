package com.playtika.javacourse.lytvynenko;

import java.util.Scanner;

public class CVCard {

    public static void main(String[] args) {


        System.out.println("Please enter your full name");
        netbuilder(new Scanner(System.in).nextLine());

    }

    public static void netbuilder (String fullname)
    {

        fullname = "* " + fullname + " *";
        String netwidth = "";

        for (int i = 0; i<fullname.length();i++)
        {
            netwidth += "*";
        }

        System.out.println(netwidth);
        System.out.println(conststrings(fullname,"Course: Java core"));
        System.out.println(conststrings(fullname,"Student"));
        System.out.println(fullname);
        System.out.println(netwidth);


    }
    private static String conststrings (String name, String conststr)
    {

        int c = name.length()- conststr.length();
        int a = c / 2;
        int b = c - a ;

        String result = "*";
        for (int i = 0; i<(a-1); i++)
        {
            result += " ";
        }
        result += conststr;


        for (int j = 0; j < (b-1); j ++)
        {
            result +=" ";

        }

        result += "*";

        return result;
    }


}
