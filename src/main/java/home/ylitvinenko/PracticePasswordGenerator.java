package home.ylitvinenko;

import java.util.Random;


public class PracticePasswordGenerator {
    static final String NUM_ALPHABET = "0123456789";
    static final String SYMBOLS_ALPHABET = "@#$%^&*";
    static final String LETTER_ALPHABET = "QEWEYEUWdjddjsnc";
    static final Random RANDOM = new Random();

    static final int NUM_TYPE = 0;
    static final int SYMBOLS_TYPE = 1;
    static final int LETTER_TYPE = 2;


    public static String createPassword (int lenght ){
        boolean hasSymbol = false;
        int countNum = 0;
        StringBuilder password = new StringBuilder();
        while(password.length() < lenght){
            int typeOfAlphabet = RANDOM.nextInt(3);
            char symbol = 0;
            switch (typeOfAlphabet){
                case NUM_TYPE:
                    if (countNum >= 3){
                        continue;
                    }
                    symbol = getRandomSymbol(NUM_ALPHABET);
                    countNum ++;
                    break;
                case SYMBOLS_TYPE:
                    if(hasSymbol){
                        continue;
                    }
                    symbol = getRandomSymbol(SYMBOLS_ALPHABET);
                    hasSymbol = true;
                    break;
                case LETTER_TYPE:
                    symbol = getRandomSymbol(LETTER_ALPHABET );
                    break;
            }
            //if(password.length() == 0 || password.charAt(password.length() - 1 != 0))){

               // continue;
          //  }

        password.append(symbol);
        }
        return password.toString();

    }
    public static char getRandomSymbol (String str){
        int index = RANDOM.nextInt(str.length());
        return str.charAt(index);

    }

    public static void main(String[] args) {
        System.out.println(createPassword(15));

    }

}
