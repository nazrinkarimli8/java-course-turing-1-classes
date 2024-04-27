package az.edu.turing;

import java.util.Arrays;
import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {

        int n = 17;
        int[] people = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int rand = random.nextInt(n);
            people[i] = rand;
        }
        System.out.println(Arrays.toString(people));
    }
}
