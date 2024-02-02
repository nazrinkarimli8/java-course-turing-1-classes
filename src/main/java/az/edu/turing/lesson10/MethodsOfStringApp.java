package az.edu.turing.lesson10;
import java.util.Scanner;
public class  MethodsOfStringApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(sentence.length());
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.trim());
    }
}
