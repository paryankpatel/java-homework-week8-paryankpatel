package week_8_homework;

import java.util.Scanner;

// Write a program to input any number and check if it Armstrong number or not
public class Pro_10_Armstrong {

    int number;
    int length;
    Pro_10_Armstrong(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        number = s.nextInt();
        length = String.valueOf(number).length(); // Convert to String and get the length
        s.close();
    }

    public static void main(String[] args) {
        Pro_10_Armstrong obj = new Pro_10_Armstrong();
        obj.CheckArmstrongNumber();
    }

    public void CheckArmstrongNumber(){
        int num = this.number;
        double armstrongNumber = 0;
        while (num > 0){
            armstrongNumber = armstrongNumber + Math.pow(num % 10, length);
            num = num / 10;
        }
        if (armstrongNumber == this.number){
            System.out.println("The given number is Armstrong Number");
        }
        else{
            System.out.println("The number is not Armstrong Number");
        }
    }

}
