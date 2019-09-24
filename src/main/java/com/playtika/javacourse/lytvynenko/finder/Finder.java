package com.playtika.javacourse.lytvynenko.finder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Finder {
    public void find (String path, String expr){
        try {
            Files.walkFileTree(Paths.get(path), new ExpressionSearcher(expr));
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e);
        }
    }

    public static void main(String[] args) {
        String path = args[0];
        String expression = args[1];

        if (args.length != 2) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println(e + "   please enter 2 arg: ");
            }
            return;
        }
        if (!Files.isRegularFile(Paths.get(path))) {
                System.out.println(" File not found ");
            return;
        }
        if (!Files.isReadable(Paths.get(path))) {
                System.out.println("Access to file is denied");
            return;
        }
        Finder finder = new Finder();
        finder.find(path, expression);
    }
}
