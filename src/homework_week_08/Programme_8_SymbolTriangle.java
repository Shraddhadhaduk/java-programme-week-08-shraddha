package homework_week_08;

import java.util.Scanner;

/**
 * 8. Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8_SymbolTriangle {
     public static void symbolTriangle(){
         int height = 5;
         for(int i = 1; i <= height; i++){
             for(int j = 1; j <= i; j++){
                 System.out.print("@");
             }
             System.out.println(" ");
         }
     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the right angle triangle :  ");
        symbolTriangle();
        int height = scanner.nextInt();
        scanner.close();
    }
}
