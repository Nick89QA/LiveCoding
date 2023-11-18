package hackerRank.IfElseStatement;

import java.util.Scanner;

/**
 * Найти четное и нечетное число
 * Если четное вывести "Weird"
 * Если нечетное вывести "Not Weird"
 */
public class IfElseSeasons {

    public static void ifElse(int n) {
     if (n % 2 ==1){
         System.out.println("Weird");
     } else if (n >=2 && n <=5) {
         System.out.println("Not Weird");

     } else if (n>=6 && n <=20) {
         System.out.println("Weird");

     }else {
         System.out.println("Not Weird");
     }

    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       ifElse(n);
        scanner.close();
    }

}





