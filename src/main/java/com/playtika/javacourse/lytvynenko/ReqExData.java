package com.playtika.javacourse.lytvynenko;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ReqExData {

    public static void main(String [] args) {
        System.out.println("Please enter your fullname ");
        nameChecker(new Scanner(System.in).nextLine());

        System.out.println("Please enter your email adress");
        emailChecker(new Scanner(System.in).nextLine());

        System.out.println("Please enter your phone number");
        phoneNumberChecker(new Scanner(System.in).nextLine());


    }


    public static void nameChecker (String name)
    {
        Pattern pattern = Pattern.compile("[A-Za-z]{1,}[\\-]{0,1}[A-Za-z]{1,}[\\s]{1}[A-Za-z]{1,}[\\-]{0,1}[A-Za-z]{1,}[\\s]{1}[A-Za-z]{1,}[\\-]{0,1}[A-Za-z]{1,}");
        Matcher matcher = pattern.matcher(name);
        boolean equal = matcher.matches();

        if(equal)
        {
            System.out.println("name IS valid");
        }
        else
        {
            System.out.println("name is NOT valid");
        }
    }


    public  static void emailChecker (String email)
    {
        Pattern pattern = Pattern.compile("([A-Za-z0-9_]{1,}[\\.-]{0,1}[A-Za-z0-9_]{1,})+@([A-Za-z0-9_]{1,}[\\.-]{0,1}[A-Za-z0-9_]{1,})+[\\.]{1}[a-z]{1,}");
        Matcher matcher = pattern.matcher(email);
        boolean equal = matcher.matches();

        if(equal)
        {
            System.out.println("email IS valid");
        }
        else
        {
            System.out.println("email is NOT valid");
        }

    }

    public  static void phoneNumberChecker (String phone)
    {
        Pattern pattern = Pattern.compile("[+]{1}[3]{1}[8]{1}[0]{1}[0-9]{9}");
        Matcher matcher = pattern.matcher(phone);
        boolean equal = matcher.matches();

        if(equal)
        {
            System.out.println("phone number IS valid");
        }
        else
        {
            System.out.println("phone number is NOT valid");
        }

    }


}
