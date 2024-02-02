package az.edu.turing.lesson07;

import java.util.Scanner;

public class SimpleDivisorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Divisors of the number:");
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("Odd divisors of the number:");
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Even divisors of the number:");
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Simple divisors:");
        }
    }



