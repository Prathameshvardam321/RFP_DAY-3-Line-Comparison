package com.bridgelabz;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Line1 x11 co-ordinate");
        int x11 = sc.nextInt();
        System.out.println("Enter Line1 y11 co-ordinate");
        int y11 = sc.nextInt();
        System.out.println("Enter Line1 x12 co-ordinate");
        int x12 = sc.nextInt();
        System.out.println("Enter Line1 y12 co-ordinate");
        int y12 = sc.nextInt();
        System.out.println("Enter Line2 x21 co-ordinate");
        int x21 = sc.nextInt();
        System.out.println("Enter Line2 y21 co-ordinate");
        int y21 = sc.nextInt();
        System.out.println("Enter Line2 x22 co-ordinate");
        int x22 = sc.nextInt();
        System.out.println("Enter Line2 y22 co-ordinate");
        int y22 = sc.nextInt();
        double line1Length = Math.sqrt(Math.pow(x12-x11,2)+Math.pow(y12-y11,2));
        double line2Length = Math.sqrt(Math.pow(x22-x21,2)+Math.pow(y22-y21,2));
        System.out.println("Length of line 1 : "+ line1Length);
        System.out.println("Length of line 2 : "+ line2Length);
        Double res1 = line1Length;
        Double res2 = line2Length;

        if ( res1.equals(res2)==true){
            System.out.println("Line 1 length is equal to Line 2 length");
        }
        else {
            System.out.println("Line 1 length is not equal to Line 2 length");
        }
    }

}