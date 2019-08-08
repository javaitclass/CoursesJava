package home.ylitvinenko;

public class MaximumAdjacentProduct {
    public static void main(String[] args) {
        adjacentElementsProduct(new int [] {10,20,30,40,50,-5});
        System.out.println(adjacentElementsProduct(new int [] {10,20,30,40,50,-5}));
    }
    public  static int adjacentElementsProduct(int[] array) {

        int result = 0;
        int x = 0;
        int y = 0;
        for (int a = 0; a<array.length ; a++ )
        {
            if (a>=(array.length-1))
            {
                return result;
            }

            x = array [a];
                     y = array [a+1];


            int multiple = x*y;
            if (result == 0)
            {
                result = multiple;
            }
            else
                if ((result<multiple) && result!= 0)
                {
                    result = multiple;
                }
        }

    return result;
    }


}
