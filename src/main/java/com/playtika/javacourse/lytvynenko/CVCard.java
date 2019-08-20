package com.playtika.javacourse.lytvynenko;
public class CVCard {
    public static void main(String[] args) {
        drowStarsLine();
    }
    public static void drowStarsLine () {
        String fullName = new String("Lytvynenko Yuriy Nikolaevich");
        StringBuffer netwidth = new StringBuffer("");
        for (int i = 0; i<fullName.length()+4;i++) {
            netwidth.append("*");
        }
        System.out.println(netwidth);
        System.out.println((centerOfWords(netwidth,"Course: Java core")));
        System.out.println((centerOfWords(netwidth,"Student")));
        System.out.println((centerOfWords(netwidth,fullName)));
        System.out.println(netwidth);
    }
    public static StringBuffer centerOfWords(StringBuffer net, String wordsWriter) {
        int c = net.length()- wordsWriter.length();
        int a = c / 2;
        int b = c - a ;
        StringBuffer result = new StringBuffer("*");
        for (int i = 0; i<(a-1); i++) {
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
