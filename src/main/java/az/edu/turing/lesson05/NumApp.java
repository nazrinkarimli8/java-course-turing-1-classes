package az.edu.turing.lesson05;

public class NumApp {
    public static void main(String[] args) {
        System.out.println(0.1 + 02);
    }
}

/*    Why doesn't 0.1+0.2=0.3 ?

     0.1 is a never-ending number when represented in binary: 0.000110011001100110011...
     0.2 is the same thing shifted one position to the left: 0.00110011001100110011..

     Add them together to get 0.3: 0.0100110011001100110011...

     The computer would soon run out of memory if it tried to add together two infinite series of zeros and ones,
     so it has to either round or truncate after certain number of digits.

     It's sort of like 1/3 + 1/3 + 1/3. You can easily see it is 1.
     But if you do it in decimals, some people get confused:
      0.333333... + 0.333333... + 0.333333... = 0.999999...

 */