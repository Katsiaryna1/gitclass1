package Exercises;

import java.util.Scanner;

public class Compare {
    public static void main (String[] args) {
        Scanner x = new Scanner(System.in);
        String name = "";
        String maxName = "";
        int maxLength = 0;
        System.out.println("enter 5 name :");

        for (int i = 0; i<5; i++) {
            name = x.nextLine() ;
            if (maxLength < name.length()) {
                maxLength = name.length();
                maxName = name;
            }
        }
                System.out.println("Longest name is " + maxName);
    }
}
