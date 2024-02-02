package az.edu.turing.lesson10;
public class CharsApp {
    public static void main(String[] args) {
        printChars(new char[]{'N', 'A', 'Z', 'R', 'I', 'N'});

        String name = "\nNazrin\n";
        System.out.print(name);
        System.out.print(name.length());
        System.out.println(name.trim());

        String s = "   1   ";
        System.out.println(s);  //   1
        s.trim();
        System.out.println(s);  //   1
        s = s.trim();
        System.out.println(s);  //1

        String abc = "ABC";
        abc = abc.replace("C", "ABCDE");
        System.out.println(abc);

        // String multipleLine = """askjbdad""";
    }

    private static void printChars(char[] charsArray) {
        for (char c : charsArray) {
            System.out.print(c);
        }
    }
}
