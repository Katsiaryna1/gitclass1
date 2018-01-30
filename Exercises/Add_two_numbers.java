package Exercises;

import java.util.Scanner;

public class Add_two_numbers {
    public static void main(String[] args ) {
        float x, y, z;
        System.out.println("Enter two numbers to get their sum " );
        Scanner in = new Scanner(System.in);
          x = in.nextFloat();
          y = in.nextFloat();
          z = x + y;
          System.out.println("Sum of entered intergers = "+z);
    }
}
