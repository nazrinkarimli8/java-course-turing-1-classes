package az.edu.turing.lesson07;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        // enhanced for loop
        for (int element : numbers) {
            System.out.printf("%d\t", element);
        }
        int sum = 0;
        int prod = 1;
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < size; i++) {
            int currentElement = numbers[i];
            sum += currentElement;
            prod *= currentElement;
            if (min > currentElement) {
                min = currentElement;
            }
            if (max < currentElement) {
                max = currentElement;
            }
        }
        System.out.println();
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
        System.out.println("Sum is: " + sum);
        System.out.println("Prod is: " + prod);

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.getClass().getName());
        System.out.println("Turing".getClass().getName());
        System.out.println(new Double(5).getClass().getName());
    }
}
