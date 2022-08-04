package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Double line1 = lengthOfLine();

        System.out.println("Length of line : " + line1);

        Double line2 = lengthOfLine();

        //checking line1 is equal, greater or less than the other line.
        int len = line1.compareTo(line2);
        if( len < 0){
            System.out.println("line1 is less than line2");
        }else if( len > 0){
            System.out.println( "line1 is greater than line2");
        }else{
            System.out.println("lines are equal");
        }

    }

    /*
    * UC-1 -> calculate the length of line
    * */
    public static double lengthOfLine(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for x1 and y1");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter values for x2 and y2");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double lengthOfLine = Math.sqrt( Math.pow(x2-x1,2) + Math.pow(y2-y1,2) );
        return lengthOfLine;
    }
}
