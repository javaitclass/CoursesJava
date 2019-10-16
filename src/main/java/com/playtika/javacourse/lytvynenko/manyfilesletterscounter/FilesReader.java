package com.playtika.javacourse.lytvynenko.manyfilesletterscounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesReader {

    private FrequenceLettersAllFiles frequencyLettersDictionary = new FrequenceLettersAllFiles();

    public static void main(String[] args) {


        String textFile = args[0];
        FilesReader program = new FilesReader();
        program.getPathStream(textFile);
    }

    public void getPathStream (String textFile){

        try {
            Stream<Path> list = Files.list(Paths.get(textFile));
            list.forEach(p -> {
                fileReading(p.toString());
            });
            frequencyLettersDictionary.printDictionary();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileReading (String textFile){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(textFile));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                frequencyLettersDictionary.appendString(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong" + e);
        }
    }
}

