package home.ylitvinenko;

public class ReversedOneWord {
    public static void main(String[] args) {
       solution("ABCD");
        System.out.println (solution("ABCD"));
    }
    public static String solution(String str) {

        String result = "";
        char [] ArrFromStr = str.toCharArray();
        for (int i = ArrFromStr.length-1; i >= 0;i--)
        {
            result += ArrFromStr[i];
        }
         // String result= new String(ArrFromStr);

        return result;

    }

}
