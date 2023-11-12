package leetCode;

import java.util.Arrays;

public class SortArray {
    /**
     * Сортировка строки brand преобразование в массив символов
     */

        public static void main(String[] args)
        {
            String str = "CADB";

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            str = new String(chars);

            System.out.println(str);
        }
    }

