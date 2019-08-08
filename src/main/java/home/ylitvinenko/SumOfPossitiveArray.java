package home.ylitvinenko;

public class SumOfPossitiveArray {
    public static void main(String[] args) {
        int [] arr = {-1,2,3,4,-5};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr) {
        int x=0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]>0)
            {
                x =x+arr[i];
            }
        }
        return x;
    }
}
