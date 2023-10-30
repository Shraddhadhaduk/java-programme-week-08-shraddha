package homework_week_08;

import java.util.Scanner;

/**
 * 2.Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
  number.
 */
public class Programme_2_MinAndMaxInputChallenge {
    public static boolean hasNextInt(Scanner scanner){
        return scanner.hasNextInt();
    }

    public static int nextInt(Scanner scanner){
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean firstInt = true;

        while (true){
            System.out.println("Enter a number : ");
            if(hasNextInt(scanner)){
                int number = nextInt(scanner);
                //first time we input number 5

                if (firstInt){
                    min = number;
                    max = number;
                    firstInt = false;
                }else{
                    if(number<min){
                        min = number;
                    }if(number>max){
                        max = number;
                    }
                }
            }else{
                System.out.println("Number is Invalid");
                break;
            }
        }
        if(firstInt){
            System.out.println("No valid numbers entered");
        }else{
            System.out.println("Minimum number entered : " + min);
            System.out.println("Maximum number entered : " + max);
        }
        scanner.close();
    }
}
