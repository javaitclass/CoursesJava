package com.playtika.javacourse.lytvynenko.finder;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionSearcher  {

    public void searching (String file, String expression) {

        try {
            Pattern pattern = Pattern.compile(expression);
            String line ;
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));
            while ((line = lineNumberReader.readLine()) != null) {
                int lineNumber = lineNumberReader.getLineNumber();
                Matcher matcher = pattern.matcher(line);
                boolean equal = matcher.find();
                if (equal) {
                    System.out.println(lineNumber + " " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong" + e);
        }
    }
}
