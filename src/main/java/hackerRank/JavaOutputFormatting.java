package hackerRank;

import java.util.Scanner;

/**
 * для форматирования используем метод Printf а также используем формат
 *  %15s для выравнивания строки по левому краю и выделения 15 символов
 *  %03d для выравнивания целого числа по правому краю и выделения трех знаков
 */

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================");
        for (int i=0;i<3;i++) {

            String sl = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", sl, x);
        }

        System.out.println("===============================");

    }
}
