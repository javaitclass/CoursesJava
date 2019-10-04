package com.playtika.javacourse.lytvynenko.letterscounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyLettersDictionary {


    Map<Character, Integer> treeMap = new TreeMap<>();
    private int globalCounter = 0;

    public void appendString (String file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = bufferedReader.readLine()) != null){
                line = line.toLowerCase();
                for (int i = 0; i < line.length(); i++){
                    char letter = line.charAt(i);
                    if (letter >= 'а' && letter <= 'я'){
                        treeMap.compute(letter, (k, v) -> v == null ? 1 : ++v);
                        globalCounter++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong" + e);
        }
    }

    public void printDictionary () {
        System.out.println("Общее количество букв: " + globalCounter);
        treeMap.entrySet().forEach(entry ->{
            System.out.printf("Частота появления буквы '%s': %4f%n", entry.getKey(), entry.getValue()/(double)globalCounter);
        });

    }


}
