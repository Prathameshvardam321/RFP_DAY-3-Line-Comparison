package com.bridgelabz;

public class Line {
    Point point1 = new Point();
    Point point2 = new Point();
    double lineLength;

   public double getLengthOfLine(){
       lineLength = Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
       return lineLength;
   }

   void getInputToLine(){
       System.out.println("Enter point 1 details : ");
       point1.getPoint();
       System.out.println("Enter point 2 details : ");
       point2.getPoint();
   }
   public static void compareByCompareToMethod(Line line1,Line line2){
     Double lineLength1 = line1.getLengthOfLine();
       Double lineLength2 = line2.getLengthOfLine();
       System.out.println("Length of line 1 is : "+lineLength1);
       System.out.println("Length of line 2 is : "+lineLength2);
        if (lineLength1.compareTo(lineLength2)==0){
           System.out.println("Line 1 and Line 2 are equal.");
       } else if (lineLength1.compareTo(lineLength2)==1) {
           System.out.println("Line 1 is greater than Line 2.");
       }else {
           System.out.println("Line 1 is lesser than Line 2.");
       }
   }
    public static void compareByEqualsToMethod(Line line1,Line line2){
        Double lineLength1 = line1.getLengthOfLine();
        Double lineLength2 = line2.getLengthOfLine();
        if (lineLength1.equals(lineLength2)){
           System.out.println("Line 1 and Line 2 are equal.");
       }else {
           System.out.println("Line 1 and Line 2 are not equal.");
       }

    }
}
