package home.ylitvinenko;

import java.util.Scanner;

public class CVCard {

    public static void main(String[] args) {
        netbuider("Lytvynenko Yuriy Nikolaevich");

    }

    public static String netbuider (String fullname)
    {
 // Scanner scanner = new Scanner(System.in);
  //System.out.println("Please enter your full name");
 // fullname = scanner.nextLine();

        fullname = "* " + fullname + " *";
        String netwidth = "";
        for (int i = 0; i<fullname.length();i++)
        {
            netwidth += "*";

        }

        String Cource = "Course: Java core";
        int c = fullname.length()- Cource.length();
        int a = c / 2;
        int b = c - a ;

        String Cource2 = "*";
        for (int i = 0;i<(a-1);i++)
        {
            Cource2 += " ";
        }
        Cource2 += Cource;

        for (int j = 0; j < (b-1); j ++)
        {
            Cource2 +=" ";

        }
        Cource2 += "*";


        String Student = "Student";
        int z = fullname.length()- Student.length();
        int x = z / 2;
        int y = z - x ;

        String Student2 = "*";
        for (int i = 0;i<(x-1);i++)
        {
            Student2 += " ";
        }
        Student2 += Student;

        for (int j = 0; j < (y-1); j ++)
        {
            Student2 +=" ";

        }
        Student2 += "*";



        System.out.println(netwidth);
        System.out.println(Cource2);
        System.out.println(Student2);
        System.out.println(fullname);
        System.out.println(netwidth);
        return netwidth;


    }

}
