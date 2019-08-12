package home.ylitvinenko;

public class StopGninnipSMysdroW {
    public static void main(String[] args) {
        spinWords("Heyq wollef sroirraw");
        System.out.println(spinWords("Hey wollef sroirraw"));

    }

    public static String spinWords(String sentence) {
        String resultFinal = "";
        String result = "";
        String splitStr[] = sentence.split(" ");
        //int size = splitStr [i].length();
        for (int i = 0;  i<splitStr.length; i++)
        {
            if (splitStr [i].length()<5)
            {
                resultFinal += splitStr [i]+ " ";
            }
            else
            {
                char arrWord[] = splitStr[i].toCharArray();
                for (int k = arrWord.length-1; k >= 0;k --)
                {
                    result += arrWord[k];

                }
                resultFinal+= result + " ";
                result = "";
            }
        }

        return resultFinal.trim();
    }
}
