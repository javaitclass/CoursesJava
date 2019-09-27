package com.playtika.javacourse.lytvynenko.wordsCounterInsideFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeMap;

public class WordsCounter {
    private TreeMap<String, Integer> treeMap = new TreeMap<>();

    public void count(String file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] arrString = line.split(" ");
                for (String s : arrString) {
                    if (treeMap.containsKey(s)) {
                        treeMap.computeIfPresent(s, (k, v) -> v = ++v);
                    } else {
                        treeMap.put(s, 1);
                    }
                }
            }
            System.out.println(treeMap.toString());

        } catch (IOException e) {
            System.out.println("Something went wrong" + e);
        }
    }
}

