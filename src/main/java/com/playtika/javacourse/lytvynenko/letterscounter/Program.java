package com.playtika.javacourse.lytvynenko.letterscounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Program {
    public static void main(String[] args) {

        String textFile = args[0];
        Path path = Paths.get(textFile);
        FrequencyLettersDictionary frequencyLettersDictionary = new FrequencyLettersDictionary();

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

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(textFile));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                frequencyLettersDictionary.appendString(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong" + e);
        }
        frequencyLettersDictionary.printDictionary();
    }
}

