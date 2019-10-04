package com.playtika.javacourse.lytvynenko.letterscounter;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        String textFile = args[0];
        Path path = Paths.get(textFile);

        //Files.list(path).forEach(
                      //  p ->  {}

               // );

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

        FrequencyLettersDictionary frequencyLettersDictionary = new FrequencyLettersDictionary();
        frequencyLettersDictionary.appendString(textFile);
        frequencyLettersDictionary.printDictionary();
    }
}

