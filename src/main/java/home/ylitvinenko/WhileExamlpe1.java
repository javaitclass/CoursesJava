package home.ylitvinenko;

public class WhileExamlpe1 {
    public static void while1 (int count)
    {
        int i =1 ;

        while (i<count){
            System.out.print(i +" ");
            i++;
        }
    }

    public static void main(String[] args) {
       while1(10);
    }
}
