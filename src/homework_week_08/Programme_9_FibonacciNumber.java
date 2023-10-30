package homework_week_08;

import java.util.Scanner;

/**
 *9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_9_FibonacciNumber {
    public static void main(String[] args){
        int a=0,b=1,c,i,count=10;
        Scanner scanner = new Scanner(System.in);
        System.out.println(a+""+b); // printing 0 and 1
        int n = scanner.nextInt();
        for(i=2;i<count;i++){
          c=a+b;
            System.out.println("" +c);
            a=b;
            b=c;
            scanner.close();
        }
    }
}
