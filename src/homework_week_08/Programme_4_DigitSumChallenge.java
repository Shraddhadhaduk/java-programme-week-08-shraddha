package homework_week_08;

import java.util.Scanner;

/**
 * 4.Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments
 */
public class Programme_4_DigitSumChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Should return 8 => 1+2+5=8
        System.out.println("Sum of 125 is = " + sumDigit(125));
        int number = scanner.nextInt();
        //should return 17 => 8+5+4 = 17
        System.out.println("Sum of 854 is = " + sumDigit(854));
        int number1 = scanner.nextInt();
        //Should return 9 => 1+8 = 9
        System.out.println("Sum of 18 is = " + sumDigit(18));
        int number2 = scanner.nextInt();
        //Should return -1
        System.out.println("Sum of -3 is = " + sumDigit(-3));
        int number3 = scanner.nextInt();
        scanner.close();

    }

    public static int sumDigit(int number) {
        if (number > 10) {
            return -1;
        }
        int sumDigit = 0;
        //convert number to string
        String numberToString = Integer.toString(number);
        //map through all char of the string
        for(char c : numberToString.toCharArray()){
            //convert the char to number again
        }
        return sumDigit;
    }
}