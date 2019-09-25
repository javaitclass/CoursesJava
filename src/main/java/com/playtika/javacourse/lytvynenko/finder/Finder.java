package com.playtika.javacourse.lytvynenko.finder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Finder {

    public static void main(String[] args) {
        String file = args[0];
        String expression = args[1];

        if (args.length != 2) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println(e + "   please enter 2 arg: ");
            }
            return;
        }
        if (!Files.isRegularFile(Paths.get(file))) {
            System.out.println(" File not found ");
            return;
        }
        if (!Files.isReadable(Paths.get(file))) {
            System.out.println("Access to file is denied");
            return;
        }
       ExpressionSearcher expressionSearcher = new ExpressionSearcher();
        expressionSearcher.searching(file, expression);
    }
}


