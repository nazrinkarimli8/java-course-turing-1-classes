package az.edu.turing;

import java.util.Scanner;

public class MethodsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(sentence.length());
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.trim());
        System.out.println(sentence.charAt());
        System.out.println(sentence.lastIndexOf());
    }
}
