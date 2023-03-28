package week_8_homework;

//14. Write a program in Java to display the pattern like a diamond.

import java.util.Scanner;

public class Pro_14_DiamondPattern {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter an odd number");
//        Program14_DiamondPattern obj = new Program14_DiamondPattern();
        int num = s.nextInt();
        s.close();
        if (num % 2 == 0){
            System.out.println("Only odd numbers are allowed");
        }
        else {
            Pro_14_DiamondPattern.printDiamond(num);
        }
    }

    public static void printDiamond(int num){
        printUpperDiamond(num);
        printLowerDiamond(num);
    }

    private static void printLowerDiamond(int num) {
        // Take the number as row
        int row = num;
        while (row > 0){
            // Count space before *
            int cnt_space = (num - row) / 2;
            // Print space
            for (int s = 1; s <= cnt_space; s++) {
                System.out.print(" ");
            }
            // Print * after space
            for (int d = 1; d <= row; d++) {
                System.out.print("*");
            }
            System.out.println("");
            row = row-2;
        }
    }

    private static void printUpperDiamond(int num) {
        int row = 1;
        while (row < num) {
                // Count space before *
                int cnt_space = (num - row) / 2;
                // Print space
                for (int s = 1; s <= cnt_space; s++) {
                    System.out.print(" ");
                }
                // Print * after space
                for (int d = 1; d <= row; d++) {
                    System.out.print("*");
                }
                System.out.println("");
            // Increment row by 2
            row = row+2;
        }
    }
}
