package com.playtika.javacourse.lytvynenko.wordsCounterInsideFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class WordsCounter {
    private TreeMap<String, Integer> treeMap = new TreeMap<>();

    public void count(String file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] arrString = line.split("[-. ,()]");
                for (String s : arrString) {
                    if (!s.isEmpty()) {
                        if (treeMap.containsKey(s)) {
                            treeMap.computeIfPresent(s, (k, v) -> v = ++v);
                        } else {
                            treeMap.put(s, 1);
                        }
                    }
                }
            }
            treeMap.entrySet().forEach(entry->{
                System.out.println(entry.getKey() + " - " + entry.getValue());
            });

        } catch (IOException e) {
            System.out.println("Something went wrong" + e);
        }
    }
}

