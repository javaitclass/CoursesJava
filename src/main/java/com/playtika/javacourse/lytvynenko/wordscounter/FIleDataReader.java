package com.playtika.javacourse.lytvynenko.wordscounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FIleDataReader {
    public static void main(String[] args) {

        String file = args[0];
        Path path = Paths.get(file);

        if (args.length != 1) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println(e + "   please enter 1 arg: ");
            }
            return;
        }
        if (!Files.isRegularFile(path)) {
            System.out.println(" File not found ");
            return;
        }
        if (!Files.isReadable(path)) {
            System.out.println("Access to file is denied");
            return;
        }
        System.out.println(path);
        WordsCounter wordsCounter = new WordsCounter();
        wordsCounter.count(file);
    }
}


