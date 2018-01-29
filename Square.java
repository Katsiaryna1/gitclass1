package Exercises;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {


        double height, breadth, square;
        Scanner x = new Scanner(System.in);
        System.out.println("What is height?");
        height=x.nextDouble();
        System.out.println("What is breadth?");
        breadth=x.nextDouble();
        square=height*breadth;
        System.out.println("this is square " + square);


    }
}