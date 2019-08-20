package com.playtika.javacourse.lytvynenko;

import java.util.Scanner;

public class CVCard {
    static final String STUDENT_TITLE ="Student";
    static final String COURSE_TITLE ="Course: Java core";
    static final int ADITIONAL_SYMBOLS = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your fullname");
        String fullName = scanner.nextLine();
        int lenghtOfLine= Math.max(fullName.length(), COURSE_TITLE.length());

        drowStarsLine(lenghtOfLine);
        centeredWords(lenghtOfLine, COURSE_TITLE);
        centeredWords(lenghtOfLine, STUDENT_TITLE);
        centeredWords(lenghtOfLine, fullName);
        drowStarsLine(lenghtOfLine);
    }

    public static void drowStarsLine (int lenghtOfLine) {
        StringBuilder startsLine = new StringBuilder();
        for (int i = 0; i < lenghtOfLine + ADITIONAL_SYMBOLS; i++) {
            startsLine.append("*");
        }
        System.out.println(startsLine);
    }

    public static void centeredWords(int lenghtOfLine, String wordsWriter) {
        int c = lenghtOfLine+ADITIONAL_SYMBOLS - wordsWriter.length();
        int a = c / 2;
        int b = c - a ;
        StringBuilder result = new StringBuilder("*");
        for (int i = 0; i < (a-1); i++) {
            result.append(" ");
        }
        result.append(wordsWriter);
        for (int j = 0; j < (b-1); j ++) {
            result.append(" ");
        }
        result.append("*");
        System.out.println(result);
    }

}
