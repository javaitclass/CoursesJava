package home.ylitvinenko;

public class CountOddNumbersBelowN {
    public static void main(String[] args) {
     oddCount(323);
     System.out.println(oddCount(323));
    }
    public static int oddCount(int n){
        int result=0;
       for (int i=0; i<n; i++)
       {
           if (i%2>0)
           {
               result=result+1;

           }

       }

        return result;
    }

}
