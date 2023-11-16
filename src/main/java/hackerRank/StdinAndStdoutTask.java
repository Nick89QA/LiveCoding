package hackerRank;

import java.io.IOException;
import java.util.Scanner;

/**
 * Ввод
 * 42
 * 3,1415
 * Welcome to HackerRank's Java tutorials!
 */

public class StdinAndStdoutTask {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); //читает до пробела
        String s = scan.nextLine();//читает после пробела




        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
