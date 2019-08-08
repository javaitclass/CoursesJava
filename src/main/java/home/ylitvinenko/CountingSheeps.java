package home.ylitvinenko;

public class CountingSheeps {
    public static void main(String[] args) {
        //System.out.println(countingSheep(12));
        countingSheep(10);
    }
    public static String countingSheep(int num) {
        String ships ="";
        for(int i=1;i<=num;i++)
        {
            ships += i+" sheep..." ;
        }
      return ships;
     }
}
