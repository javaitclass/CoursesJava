package home.ylitvinenko;

import java.util.Arrays;

import static java.util.Arrays.*;

public class ReserveWords {
    public static void main(String[] args) {
    reverseWords("I like eating");
    System.out.println(reverseWords("I like eating"));
    }
    public static String reverseWords(String str){
        String result = "";
        String splitStr[] = str.split(" ");
        for ( int i = splitStr.length-1; i >=0; i--)
        {
            result+= splitStr[i] + " ";

        }


       return  (result.trim());


    }
}


//int x = charArr[1];

//int x = charArr.length;
//System.out.println( charArr.length);

// for(int i=str.length(); i>=0;i--);

// str.indexOf(" ", i);

//System.out.println(str[i-1]);
//it probel=0;
///for (int i=0;i<str.length();i++);
//  if ()
//        int probel = str.indexOf(" ");
//        System.out.println(probel);
//        probel= probel+1;
//        probel = str.indexOf(" ",probel);
//        System.out.println(probel);
//        probel= probel+1;
//        probel = str.indexOf(" ",probel);
//        System.out.println(probel);
//        probel= probel+1;
//        probel = str.indexOf(" ",probel);
//        System.out.println(probel);


// for (probel = str.indexOf(" ");probel<str.length();probel++);
//probel+=probel;
// System.out.print(probel);


// public static String reverseWords(String str){

//   return str;
//}
// char [] result = str.toCharArray();
//for (int i=0;i<result.length;i++)
// System.out.println(i + result[i]);

