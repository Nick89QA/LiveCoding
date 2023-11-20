package hackerRank.InputOutputFormat;

import java.util.Scanner;

/**
 * выводить строки с нумерацией до тех пор пока не закончится файл EOF например STDOUT
 * 1 Hello world
 * 2 I am a file
 * 3 Read me until end-of-file.
 */

public class JavaEndOfFileWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber =1; //обьявляем переменную номер строки
        while (sc.hasNextLine()){
            String phrase = sc.nextLine(); //строка принимется с консоли
            System.out.println(lineNumber + " " + phrase);
            lineNumber++;// каждую итерацию увеличиваем номер строки
        }

    }
}

