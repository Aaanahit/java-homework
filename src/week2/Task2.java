package week2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d= scanner.nextDouble();
        float f= (float)d;

        f= scanner.nextFloat();
        long l=(long)f;

        l= scanner.nextInt();
        int i= (int)l;

        i= scanner.nextInt();
        short s=(short)i;

        s= scanner.nextShort();
        byte b= (byte)s;
        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);

    }
}
