package home.ylitvinenko;

import java.util.Scanner;

public class Velocity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance in km");
        int distance = scanner.nextInt();
        distance = distance * 1000;

        System.out.println("Enter time in min");
        int time = scanner.nextInt();
        time *= 60;

        int velocity = distance / time;

        System.out.printf("Speed equals %d", velocity);
    }
}
