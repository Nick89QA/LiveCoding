package leetCode;

import java.util.Arrays;

/**
 * Имея две строки s brand t, вернуть true, если t является анаграммой s, brand false в противном случае.
 * Анаграмма — это слово или фраза, образованная путем перестановки букв другого слова или фразы,
 * обычно с использованием всех исходных букв ровно один раз.
 */


public class ValidAnagram {


    public static boolean isAnagram(String s, String t) {
        s = s.toLowerCase().replaceAll("/", ""); //убрали все символы и перевели в нижний регистр
        t = t.toLowerCase().replaceAll("/", "");


        if (s.length() != t.length()) { //проверяем что строки имеют одинаковую длинну
            return false;
        }
        char[] charArray1 = s.toCharArray(); // преобразовали строку в массив символов
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray1); // отсортировали в алфавитном порядке
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2); // сравниваем
    }


    public static void main(String[] args) {
        System.out.println(isAnagram("hsssfsf i", "hi "));
        System.out.println(isAnagram("oh", "Oh"));

    }
}


