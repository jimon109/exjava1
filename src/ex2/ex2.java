package ex2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter number: ");
        double d = SC .nextDouble();

        System.out.print("Entter String: ");
        String s = SC.next();

        System.out.print("Entter numint: ");
        int i = SC.nextInt();

        System.out.println("NunberDouble is " + d);
        System.out.println("String  is " + s);
        System.out.println("NumberInt  is " + i);
    }
}
