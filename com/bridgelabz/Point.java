package com.bridgelabz;

import java.util.Scanner;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
   public void getPoint(){

        Scanner scan = new Scanner(System.in);
       System.out.println("Enter x co-ordinate : ");
        x = scan.nextDouble();
       System.out.println("Enter y co-ordinate : ");
        y = scan.nextDouble();
    }
}
