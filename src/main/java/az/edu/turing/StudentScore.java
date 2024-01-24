package az.edu.turing;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grade = sc.nextDouble();
        if (grade > 0 && grade < 51) {
            System.out.println("F");
        } else if (grade >= 51 && grade < 61) {
            System.out.println("E");
        } else if (grade >= 61 && grade < 71) {
            System.out.println("D");
        } else if (grade >= 71 && grade < 81) {
            System.out.println("C");
        } else if (grade >= 81 && grade < 91) {
            System.out.println("B");
        } else if (grade >= 91 && grade <= 100) {
            System.out.println("A");
        } else {
            System.out.println("wrong grade");
        }
    }
}
