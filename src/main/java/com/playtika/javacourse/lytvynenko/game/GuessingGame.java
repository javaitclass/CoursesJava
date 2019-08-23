package com.playtika.javacourse.lytvynenko.game;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GuessingGame {
    private final LetterMixer letterMixer;
    private  final WorldSource worldSource;
   private  final Scanner scanner;

    public GuessingGame(Scanner scanner) {
        letterMixer = new LetterMixer();
        worldSource = new WorldSource();
        this.scanner = scanner;

    }

    public void playGame(){
        //System.out.println("Guess a word");
        //System.out.printf("Guess a word: %s");
        String word = worldSource.getWord();
        String mixedWord = letterMixer.mix(word);
        System.out.printf("Guess a word: %s%n",mixedWord);
        String inputWord = scanner.nextLine();
        while(!word.equals(inputWord)){
            System.out.println("Incorect answear, please try again !");
            inputWord = scanner.nextLine();

        }
        System.out.println("Good job !");

    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame(new Scanner(System.in));
        game.playGame();
    }
}
