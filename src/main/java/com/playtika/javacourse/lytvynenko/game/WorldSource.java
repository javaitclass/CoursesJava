package com.playtika.javacourse.lytvynenko.game;

import java.util.concurrent.ThreadLocalRandom;

public class WorldSource {
    private static final String[] WORDS = {
            "cat",
            "dog",
            "bird",
            "apple",
            "flower",
            "someword"
    };


    public String getWord (){
      int index =  ThreadLocalRandom.current().nextInt(WORDS.length - 1);
      return WORDS[index];

    }
}
