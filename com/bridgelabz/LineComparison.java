package com.bridgelabz;
import java.util.*;

public class LineComparison {
    static void calculateLength(int x11,int y11,int x12,int y12,int x21,int y21,int x22,int y22){

        double line1Length = Math.sqrt(Math.pow(x12-x11,2)+Math.pow(y12-y11,2));
        System.out.println(line1Length);
        double line2Length = Math.sqrt(Math.pow(x22-x21,2)+Math.pow(y22-y21,2));
        System.out.println(line2Length);
        if (line1Length == line2Length){
            System.out.println("Line 1 length is equal to Line 2 length");
        }
        else {
            System.out.println("Line 1 length is not equal to Line 2 length");
        }


    }

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
        calculateLength(x11,y11,x12,y12,x21,y21,x22,y22);

    }

}