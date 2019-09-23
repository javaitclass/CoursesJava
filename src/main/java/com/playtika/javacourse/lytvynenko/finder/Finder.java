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
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println(e + "   please enter 2 arg: ");
            }
            return;
        }
        if (!Files.isRegularFile(Paths.get(args[0]))) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println(e + "  File not found ");
            }
            return;
        }
        if (!Files.isReadable(Paths.get(args[0]))) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println(e + "  Access to file is denied");
            }
            return;
        }
        Finder finder = new Finder();
        finder.find(args[0], args[1]);
    }
}
