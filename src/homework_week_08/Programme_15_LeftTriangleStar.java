package homework_week_08;

/**
 * 15.Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Programme_15_LeftTriangleStar {
    public static void main(String[] args) {
        int rows = 5; // Change this value to control the number of row in the triangle

        for(int i = 1; i <=rows; i++){
            for(int j = 1;j<= i; j++){
                System.out.print("*");
            }
            System.out.println();// move to the next line for next row
        }
    }

}
