package week_8_homework;
// Write a program in Java to display the pattern like a triangle with a number.
import java.util.Scanner;

public class Pro_6_NumTriangle {

    public static void main(String[] args) {

        Pro_6_NumTriangle obj = new Pro_6_NumTriangle();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();
        s.close();
        obj.printTriangle(num);
    }

    public void printTriangle(int num) {

        // loop to print the pattern
        for (int i = 0; i <= num; i++) {
            // print column
            for (int j = 0; j < i; j++) {

                System.out.print(j + 1);
            }
            System.out.println();
        }

    }
}
