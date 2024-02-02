package az.edu.turing.lesson11;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        String name = getName(email);
        System.out.println(name);
        System.out.println(nameLength(name));
    }

    public static String getName(String s) {
        return s.substring(0, s.indexOf("@"));

    }

    public static int nameLength(String name) {
        return name.length();
    }
}