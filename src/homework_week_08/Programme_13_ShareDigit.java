package homework_week_08;

/**
 * 13.Shared digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false
 */
public class Programme_13_ShareDigit {
    public static boolean shareDigit(int a, int b) {
        //check if a is less than 10 and b is grater than 99
        if (a < 10 || b > 99) {
            return false;
        }

        //Extract the last digit of each number
        int x = a % 10;
        int y = b % 10;

        //Remove the last digit from both number
        a /= 10;
        b /= 10;

        //check if there is a common digit by comparing the remaining digits
        return (a == b || a == y || x == b || x == y);
    }

    public static void main(String[] args) {
        System.out.println(shareDigit(12, 26));
    }


}




