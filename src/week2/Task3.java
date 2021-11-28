package week2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r= scanner.nextDouble();
        double p = Math.PI;

        double perimeter = 2*p*r;
        double area = p*Math.pow(r,2);

        System.out.println(perimeter);
        System.out.println(area);
    }
}
