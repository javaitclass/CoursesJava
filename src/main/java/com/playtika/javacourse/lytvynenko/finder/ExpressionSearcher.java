package com.playtika.javacourse.lytvynenko.finder;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionSearcher  {

    public void searching (String file, String expression) {

        try {
            Pattern pattern = Pattern.compile(expression);
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));
            String line ;
            int lineNumber;
            boolean equal;
            while ((line = lineNumberReader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                equal = matcher.find();
                if (equal) {
                    lineNumber = lineNumberReader.getLineNumber();
                    System.out.println(lineNumber + " " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong" + e);
        }
    }
}
