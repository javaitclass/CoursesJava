package home.ylitvinenko;

public class ShortestWord {
    public static void main(String[] args) {
        findShort("hi world f aaaaaaaaaaaaa asssssssss");
        System.out.println (findShort("hi world f aaaaaaaaaaaaa asssssssss"));
    }

    public static int findShort(String s) {
        String result = "";
        int y = 0;
        String splitStr[] = s.split(" ");
        int x = splitStr.length;
        for ( int i = 0; i < splitStr.length; i++)
        {
            result= splitStr[i];
            int size = splitStr [i].length();
            //System.out.println("word:"+splitStr[i] + " - " + size);
            char [] charResult = result.toCharArray();
            y = charResult.length;

                if (x > y)
                {
                    x = y;
                }

        }
        return x;
    }
    }




