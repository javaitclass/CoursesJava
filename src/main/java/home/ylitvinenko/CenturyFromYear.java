package home.ylitvinenko;

public class CenturyFromYear {
    public static void main(String[] args) {
    century(1233);
    System.out.println(century(1233));
    }
    public static int century(int number)
    {
        int result = number;
        int i = 100;
         if (result%i>0)
         {
             result=result/i+1;
         } else
             result=result/i;

         return result;

    }


}
