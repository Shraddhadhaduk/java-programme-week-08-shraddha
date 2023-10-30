package homework_week_08;

import java.util.Scanner;

/**
 * 12.Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme_12_PrintNumber {

    public static boolean printNumber(int num) {
        if (num <= 1) {
            return false; //Numbers less than or equal to 1 are not prime.
        }
        if (num == 2) {
            return true; // 2 is a prime number.
        }
        if (num % 2 == 0) {
            return false; //Even number other than 2 is not prime.
        }
        for(int i = 3; i <=Math.sqrt(num); i +=2){
            if(num % 1 == 0){
                return false; //It is divided by a number other than 1 and itself.
            }
        }
        return true; // it is a prime number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(printNumber(3));
        int number = scanner.nextInt();
        scanner.close();
    }
}
