package week_8_homework;
// Digit Sum Challenge
//        Write a method with the name sumDigits that has one int parameter called number.
//        If the parameter is >= 10 then the method should process the number and return sum of all digits,
//        otherwise return -1 to indicate an invalid value.
//        The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
//        negative numbers, so also return -1 for negative numbers.
//        For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
//        Calling the method sumDigits(1) should return -1 as per requirements described above.
//        Add some code to the main method to test out the sumDigits method to determine that it is working
//        correctly for valid and invalid values passed as arguments.
public class Pro_4_DigitSumChallenge {

    public static void main(String[] args) {
        sumDigits(125);
        sumDigits(-1);
    }

    public static void sumDigits(int number) {

        int sum = 0;
        while (number > 0) {
            //finds the last digit of the given number
            sum = sum +  number % 10;
            //removes the last digit from the number
            number =  number / 10;

        }
        //prints the result
        System.out.println("Sum of digits " + sum);

    }


}

