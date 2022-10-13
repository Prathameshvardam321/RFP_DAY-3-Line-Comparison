package com.bridgelabz;
import java.util.*;

public class LineComparison {
static double line1Length;
static double line2Length;
        static double calculateLength1 ( double x11, double y11, double x12, double y12){
            line1Length = Math.sqrt(Math.pow(x12 - x11, 2) + Math.pow(y12 - y11, 2));
            System.out.println("Length of line 1 : "+line1Length);
            return line1Length;
        }
        static double calculateLength2 ( double x21, double y21, double x22, double y22){
            line2Length = Math.sqrt(Math.pow(x22 - x21, 2) + Math.pow(y22 - y21, 2));
            System.out.println("Length of line 2 : "+line2Length);
            return line2Length;
        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Line1 x11 co-ordinate");
            double x11 = sc.nextInt();
            System.out.println("Enter Line1 y11 co-ordinate");
            double y11 = sc.nextInt();
            System.out.println("Enter Line1 x12 co-ordinate");
            double x12 = sc.nextInt();
            System.out.println("Enter Line1 y12 co-ordinate");
            double y12 = sc.nextInt();
            System.out.println("Enter Line2 x21 co-ordinate");
            double x21 = sc.nextInt();
            System.out.println("Enter Line2 y21 co-ordinate");
            double y21 = sc.nextInt();
            System.out.println("Enter Line2 x22 co-ordinate");
            double x22 = sc.nextInt();
            System.out.println("Enter Line2 y22 co-ordinate");
            double y22 = sc.nextInt();
            Double res1 = calculateLength1(x11, y11, x12, y12);
            Double res2 = calculateLength2(x21, y21, x22, y22);
            if (res1.equals(res2)==true){
                System.out.println("Length of line 1 and line 2 are equal.");
            }else {
                System.out.println("Length of line 1 and line 2 are not equal.");
            }

            if (res1.compareTo(res2)==0){
                System.out.println("Length of line 1 and line 2 are equal.");
            } else if (res1.compareTo(res2)==1) {
                System.out.println("Length of line 1 is greater than length of line 2.");
            }else {
                System.out.println("Length of line 1 is smaller than length of line 2.");
            }
        }
    }