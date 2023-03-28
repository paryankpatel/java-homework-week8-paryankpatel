package week_8_homework;

import java.util.Scanner;

// Read 10 numbers from the console entered by the user and print the sum of those
//        numbers.
public class Pro_1_ReadingUserInputChallenge {
    public static void main(String[] args) {
        Pro_1_ReadingUserInputChallenge obj = new Pro_1_ReadingUserInputChallenge(); // creating an object
        obj.input(); // calling an instance method
    }
    public void input() // declaring an instance method
    {
        int counter = 1; // declaring and intiLISING a variable
        int sum = 0;
        // int number;

        Scanner scan = new Scanner(System.in); // to read the input from the console
        // logic to sum the put number
        while (counter <= 10) {
            System.out.print("Enter number #" + counter + ":");
            boolean checkNumber = scan.hasNextInt(); // to check whether the input value is number or not

            if (checkNumber == true) {

                int number = scan.nextInt(); // execute the if the user enters the valid input
                sum = sum + number;
                counter++;
            } else {
                System.out.println("Enter valid number"); // out put if the condition is false
            }
            scan.nextLine(); // allows to input the number again

        }
        System.out.println("Sum of 10 numbers: " + sum); // output the sum of the input numbers
        scan.close();
    }

}
