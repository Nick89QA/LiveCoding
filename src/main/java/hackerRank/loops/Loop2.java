package hackerRank.loops;

import java.util.Scanner;

/**
 * вывести последовательно используя формулу =0 + 1 * 2 = 2
 */

public class Loop2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i ++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
           int res = a;

           for (int j = 0;j<n;j++) {
               res +=Math.pow(2, j) * b;//функиця возведения числа 2 в степень j
               System.out.print(res + " ");
           }
            System.out.println();

        }
         in.close();
    }

}


