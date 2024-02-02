package az.edu.turing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 1 && n <= 3) {
            System.out.println("Initial");
        } else if (n >= 4 && n <= 6) {
            System.out.println("Average");
        } else if (n >= 7 && n <= 9) {
            System.out.println("Sufficient");
        } else if (n >= 10 && n <= 12) {
            System.out.println("High");
        }
    }
}

