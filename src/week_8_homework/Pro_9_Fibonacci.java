package week_8_homework;

import java.util.Scanner;

// Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class Pro_9_Fibonacci {

    static int counter;
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter how many numbers you want: ");
        counter = s.nextInt();
        fibonacci();

    }

    public static void fibonacci(){

        int a = 1, b=1, c, count = counter;
        System.out.print(a + " " + b);
        for(int i = 2; i<count; ++i ){
            c = a+b;
            System.out.print(" " + c);
            a = b;
            b = c;

        }

    }
}

