package az.edu.turing.lesson05;

import java.util.Scanner;

public class SeasonsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int n = sc.nextInt();
        System.out.println((n >= 1 && n <= 2) ? "winter" : ((n >= 3 && n <= 5) ?
                "spring" : ((n >= 6 && n <= 8) ? "summer" : ((n >= 9 && n <= 11) ?
                "autumn" : (n == 12 ? "winter" : "Choose a number between 1 and 12")))));
    }
}
