package az.edu.turing.lesson05;

import java.util.Scanner;

public class LetterScanApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine(); // returns the entire text up to the return line.
        String sentence=sc.next(); // reads up to the space

        System.out.println(word);
        System.out.println(sentence);
    }
}
