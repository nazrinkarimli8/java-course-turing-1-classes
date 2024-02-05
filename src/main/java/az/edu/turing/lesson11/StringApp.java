package az.edu.turing.lesson11;

import java.util.Scanner;

public class StringApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
