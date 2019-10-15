package com.playtika.javacourse.lytvynenko.manyfilesletterscounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesReader {

    public static void main(String[] args) {

        String textFile = args[0];
        FilesReader program = new FilesReader();
        program.getPathStream(textFile);
    }

    private void getPathStream (String textFile){
        try {
            Stream<Path> list = Files.list(Paths.get(textFile));
            list.forEach(p -> {
                System.out.println("Фаил : " + p +  "\n");
                fileReading(p.toString());
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void fileReading (String textFile){
        try {
            FrequenceLettersAllFiles frequencyLettersDictionary = new FrequenceLettersAllFiles();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(textFile));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                frequencyLettersDictionary.appendString(line);
            }
            frequencyLettersDictionary.printDictionary();
        } catch (IOException e) {
            System.out.println("Something went wrong" + e);
        }
    }
}

