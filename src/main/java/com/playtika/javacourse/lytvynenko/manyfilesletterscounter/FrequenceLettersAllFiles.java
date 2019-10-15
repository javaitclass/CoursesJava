package com.playtika.javacourse.lytvynenko.manyfilesletterscounter;

import java.util.Map;
import java.util.TreeMap;

public class FrequenceLettersAllFiles {

    Map<Character, Integer> treeMap = new TreeMap<>();
    private int globalCounter = 0;

    public void appendString (String line) {
        line = line.toLowerCase();
        for (int i = 0; i < line.length(); i++){
            char letter = line.charAt(i);
            if (letter >= 'a' && letter <= 'z'){
                treeMap.compute(letter, (k, v) -> v == null ? 1 : ++v);
                globalCounter++;
            }
        }
    }

    public void printDictionary () {
        System.out.println("Общее количество букв: " + globalCounter);
        treeMap.entrySet().forEach(entry ->{
            System.out.printf("Частота появления буквы '%s': %4f%n", entry.getKey(), entry.getValue()/(double)globalCounter);
        });
        System.out.println("\n");
    }
}
