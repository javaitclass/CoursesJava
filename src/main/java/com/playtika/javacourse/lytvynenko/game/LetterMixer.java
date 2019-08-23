package com.playtika.javacourse.lytvynenko.game;

import java.util.concurrent.ThreadLocalRandom;

public class LetterMixer {
    public String mix (String word) {

    String mixerWord = mixLetter (word);
    while (word.equals(mixerWord)){
        mixerWord = mixLetter(word);
    }
        return mixerWord;
    }



    public String mixLetter(String word){
        char [] letters = word.toCharArray();
        for(int i = 0; i<letters.length-1;i++ ){
            int index = ThreadLocalRandom.current().nextInt(letters.length);
            char temp;
            temp = letters [i];
            letters [i] = letters [index];
            letters [index] = temp;

        }
        return new String (letters);
    }


}