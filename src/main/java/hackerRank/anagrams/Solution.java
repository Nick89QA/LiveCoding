package hackerRank.anagrams;


import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase().replaceAll("/", "");//убрали все символы и перевели в нижний регистр
        b = b.toLowerCase().replaceAll("/", "");
        if(a.length() != b.length()){ //проверяем что строки имеют одинаковую длинну
            return false;
        }
        char[] charArray1 = a.toCharArray();// преобразовали строку в массив символов
        char[] charArray2 = b.toCharArray();
        Arrays.sort(charArray1);// отсортировали в алфавитном порядке
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
