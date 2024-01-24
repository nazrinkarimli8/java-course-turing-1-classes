package az.edu.turing;
import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Ayın nömrəsini daxil edin: ");
        int n=sc.nextInt();


        System.out.println(  (n>=1 && n<=2) ? "qış" :  ((n>=3 && n<=5) ? "yaz" :
                ((n>=6 && n<=8) ? "yay" :  ( (n>=9 && n<=11) ? "payız" :
                        ( n==12  ? "qış" : "1 ve 12 arasinda eded secin")  )  )  )  );

    }
}