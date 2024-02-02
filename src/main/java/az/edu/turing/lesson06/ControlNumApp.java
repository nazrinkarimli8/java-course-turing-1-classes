package az.edu.turing.lesson06;

import java.util.Scanner;

public class ControlNumApp {
    public static void main(String[] args) {
        System.out.println("Enter number of month: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (num < 0) {
            System.out.println("negative");
        } else if (num == 0) {
            System.out.println("zero");
        } else {
            System.out.println("positive");
        }
    }
}
