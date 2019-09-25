package com.playtika.javacourse.lytvynenko.finder;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionSearcher  {

    public void searching (String file, String expression) {

        try {
            Pattern pattern = Pattern.compile(expression);
            String line ;
            int lineNumber;
            boolean equal;
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));
            while ((line = lineNumberReader.readLine()) != null) {
                lineNumber = lineNumberReader.getLineNumber();
                Matcher matcher = pattern.matcher(line);
                equal = matcher.find();
                if (equal) {
                    System.out.println(lineNumber + " " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong" + e);
        }
    }
}
