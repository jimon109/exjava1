package ex3;

import com.sun.xml.internal.fastinfoset.stax.factory.StAXOutputFactory;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("ป้อนชื่อ>> ");
        String fname = SC .next();

        System.out.print("ป้อนอายุ>> ");
        int age =SC.nextInt();

        System.out.print("ป้อนที่อยู่>> ");
        String address = SC.next();

        System.out.printf("ชื่อ: %s,อายุ: %s",fname,age,address);
    }
}
