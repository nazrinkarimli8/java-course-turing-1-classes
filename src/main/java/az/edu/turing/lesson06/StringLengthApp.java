package az.edu.turing.lesson06;

import java.util.Scanner;

public class StringLengthApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String a = sc.nextLine();
        System.out.println(a.length() * 2);
    }
}
