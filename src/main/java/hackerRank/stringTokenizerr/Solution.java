package hackerRank.stringTokenizerr;

import java.util.Scanner;

/**
 * Разделить входящую строку и убрать из нее все спецсимволы
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Считываем строку с клавиатуры и удаляем лишние пробелы в начале и конце строк
        String input = scan.nextLine().trim();
        scan.close();

        // Разбиваем строку на подстроки (токены) с использованием регулярки
        String[] tokens = input.split("[^\\p{Alpha}]+");

        // Вычисляем количество токенов (слов)
        int size = (input.isEmpty()) ? 0 : tokens.length;
        System.out.println(size);

        // Выводим каждый токен (слово) на отдельной строке
        for(String s : tokens) {
            System.out.println(s);
        }
    }

}
