package home.ylitvinenko;

import java.util.Arrays;
public class SentenceSmash {
    public static void main(String[] args) {
    smash("I","like","football");
    }
    public static String smash(String... words) {

        String result = "";
        for (int i = 0; i<words.length; i++)
        {
            result += words[i] +" " ;
        }
        return (result.trim());
    }
}
