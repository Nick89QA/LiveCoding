package leetCode2.ArraysAndHashing;


import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sCharArray = s.toCharArray();//преобразовываем в символы строку s
        char[] tCharArray = t.toCharArray();//преобразовываем в символы строку t

        Arrays.sort(sCharArray);//сортируем массив s
        Arrays.sort(tCharArray);//сортируем массив t


        return Arrays.equals(sCharArray, tCharArray); //сравниваем 2 массива
    }
}
