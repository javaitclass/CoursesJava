package home.ylitvinenko;

public class SeparateNumbers {
    public static void main(String[] args) {
        int a = 95711;
        int b = 10000,c = 1000,d = 100, e = 10;
        int f = a/b;
        int g = (a-b*f)/c;
        int i = ((a-b*f)-(g*c))/d;
        int j = (((a-b*f) - (g*c))-(i*d))/e;
        int k = (((a-b*f) - (g*c))-(i*d))-(j*e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

    }
}