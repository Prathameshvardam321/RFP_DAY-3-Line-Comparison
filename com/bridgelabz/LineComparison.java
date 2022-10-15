package com.bridgelabz;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
     Line line1 = new Line();
     Line line2 = new Line();
     System.out.println("Enter the Line 1 details : ");
     line1.getInputToLine();
     System.out.println("Enter the Line 2 details : ");
     line2.getInputToLine();
     Line.compareByCompareToMethod(line1,line2);
     Line.compareByEqualsToMethod();

    }
}
