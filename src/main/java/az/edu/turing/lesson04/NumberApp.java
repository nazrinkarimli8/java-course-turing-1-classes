package az.edu.turing.lesson04;

public class NumberApp {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a / 2);

        float b; // declare
        b = 4; // init
        System.out.println(b * 5);

        System.out.printf("%.3f\n", a / b);

        char symbol1 = 'x';
        System.out.println(symbol1);
        System.out.println(symbol1 + 1);

        char c1 = '\u0022';
        System.out.println(c1);

        boolean b1 = true;
        boolean b2 = false;

        System.out.printf("%d\n", 14);
        System.out.printf("%.6f\t\t\t", 14d);

        int radius = 12;
        System.out.println(Math.PI); // Area = PI * R^2
        System.out.println(Math.PI * Math.pow(radius, 2)); // Area = PI * R^2
        System.out.println(Math.sqrt(16));
    }
}
