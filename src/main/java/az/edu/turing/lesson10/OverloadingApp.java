package az.edu.turing.lesson10;

import java.util.Scanner;

public class OverloadingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double num2 = sc.nextDouble();

        int result1 = sum(num);
        double result2 = sum(num2);
        System.out.println(result1);
        System.out.println(result2);
    }

    private static int sum(int number) {
        return number + 2;
    }

    private static double sum(double number) {
        return number + 2;
    }
}
