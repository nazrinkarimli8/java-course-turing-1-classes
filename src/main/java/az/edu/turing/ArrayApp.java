package az.edu.turing;

import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i + j) < n) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}

