package week_8_homework;

//12. Write a programme to input any number and check if it is prime or not.
import java.util.Scanner;

public class Pro_12_Prime {

    int temp;
    boolean isPrime = true;

    public static void main(String[] args) {

        Pro_12_Prime obj = new Pro_12_Prime();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();
        s.close();
        obj.checkPrime(num);

    }

    public void checkPrime(int num) {

        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if (isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }

}


