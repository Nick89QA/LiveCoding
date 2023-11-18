package hackerRank.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * вывести через цикл умножение пример:
 * 2 * 1 = 2 и до 10
 */

public class JavaLoopsTwoMultiplyTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim()); //читаем число с консоли
        for (int i = 1; i <= 10; i++) {
            int res = N * i; //умножаем наше число с ввода на переменную в цикле
            System.out.println(N + " x " + i + " = " + res);
        }

    }
}


