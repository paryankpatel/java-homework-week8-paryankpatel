package week_8_homework;

import java.util.Scanner;

// Write a Java program that takes the user to provide a single character from the
//        alphabet. Print Vowel of Consonant, depending on the user input. If the user input
//        Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
//        error message.
//        For eg:
//        Input an alphabet: p
//        Expected Output:
//        Input letter is Consonant
public class Pro_3_VowelAndConsonant {

    public static void main(String[] args) {

        Pro_3_VowelAndConsonant obj = new Pro_3_VowelAndConsonant();
        obj.vowelAndConsonant();

    }

    public void vowelAndConsonant() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter");
        String a = sc.next();
        if (a.length() == 1 && Character.isAlphabetic((a.charAt(0)))) {
            char ch = Character.toLowerCase((a.charAt(0)));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(a + " is a vowel");
            } else {

                System.out.println(a + " is a consonant");
            }

        } else {

            System.out.println("Invalid Input");
        }

    }
}

