package week_8_homework;

import java.util.Scanner;

// Display right angle triangle of @ using nested for loops
public class Pro_8_rightAngleTriangle {

    public static void main(String[] args) {

        Pro_8_rightAngleTriangle obj = new Pro_8_rightAngleTriangle();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();
        s.close();
        obj.rightAngleTriangle(num);
    }

    public void rightAngleTriangle(int num){

        // loop to print the pattern
        for(int i =0; i<= num; i++){
            // print column
            for(int j=0; j<i; j++){
                System.out.print("@");
            }
            System.out.println();
        }

    }
}
