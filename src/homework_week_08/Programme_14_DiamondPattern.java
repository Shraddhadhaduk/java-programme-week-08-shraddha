package homework_week_08;

import java.util.Scanner;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 *RIME TESTING
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */
public class Programme_14_DiamondPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get  the number of rows for the diamond pattern  from the user
        System.out.println("Enter the number of rows for the diamond pattern: ");
        int rows = scanner.nextInt();
        // Call the printDiamondPattern method to print the diamond pattern printDiamondPattern
        printDiamondPattern(rows);
        // Close the scanner
        scanner.close();
    }

    // Method to print a diamond pattern with the given number of rows
    public static void printDiamondPattern(int rows) {
        int i = 1;
        int space = rows - 1;
        // Print the upper half of the diamond pattern
        while (i <= rows) {
            int j = 1;
            // Print spaces before the stars
            while (j <= space) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            // Print stars
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            // Move to the next line
            System.out.println();
            space--;
            i++;
        }
        // Reset variables for the lower half of the diamond pattern
        i = rows - 1;
        space = 1;
        // Print the lower half of the diamond pattern
        while (i >= 1) {
            int j = 1;

            // Print spaces before the stars
            while (j <= space) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            // Print stars
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            // Move to the next line
            System.out.println();
            space++;
            i--;
        }
    }
}
