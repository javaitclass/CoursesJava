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
        if (args.length != 2) {
            System.out.println("Enter 2 arg");
            return;
        }
        if (!Files.isReadable(Paths.get(args[0]))) {
            System.out.println("Invalid path");
            return;
        }
        Finder finder = new Finder();
        finder.find(args[0], args[1]);
    }

}
