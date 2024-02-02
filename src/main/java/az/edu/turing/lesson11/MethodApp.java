package az.edu.turing.lesson11;

import java.util.Scanner;

public class MethodApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        System.out.println(getName(email));
        System.out.println(nameLength(getName(email)));
    }

    public static String getName(String s) {
        String name = s.substring(0, s.indexOf("@"));
        return name;
    }

    public static int nameLength(String name) {
        return name.length();
    }
}

