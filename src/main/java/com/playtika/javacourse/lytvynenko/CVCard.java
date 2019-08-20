package com.playtika.javacourse.lytvynenko;
public class CVCard {
    public static void main(String[] args) {
        drowStarsLine();
    }
    public static void drowStarsLine () {
        String fullName = new String("Lytvynenko Yuriy Nikolaevich");
        StringBuilder startsLine = new StringBuilder("");
        for (int i = 0; i < fullName.length()+4; i++) {
            startsLine.append("*");
        }
        System.out.println(startsLine);
        System.out.println((centeredWords(startsLine, "Course: Java core")));
        System.out.println((centeredWords(startsLine, "Student")));
        System.out.println((centeredWords(startsLine, fullName)));
        System.out.println(startsLine);
    }
    public static StringBuilder centeredWords(StringBuilder starsLine, String wordsWriter) {
        int c = starsLine.length()- wordsWriter.length();
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
        return result;
    }
}
