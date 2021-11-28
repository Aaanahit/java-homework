package week2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte b= scanner.nextByte();
        short s=b;

        s= scanner.nextShort();
        int i=s;

        i= scanner.nextInt();
        long l=i;

        l= scanner.nextLong();
        float f=l;

        f= scanner.nextFloat();
        double d=f;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
    }

}
