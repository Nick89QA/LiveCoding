package leetCode;

import java.util.Arrays;

public class ValidAnagram2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){//если длинна строки s неравна строке t то получаем false
            return false;
        }
     int[] charsCounter = new int[26];//создали масив одномерный емкость 26 символов
        for (int i=0; i< s.length(); i ++){ //идем циклом по строке s
          charsCounter[s.charAt(i) - 'a'] ++;// увеличиваем счетчик элемента массива, который соответствует текущей букве в строке s
          charsCounter[t.charAt(i) - 'a'] --;
        }
        for(int counter: charsCounter) {
            if (counter != 0) {
                 return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram2 a =  new ValidAnagram2();
        a.isAnagram("listen","silent");
        a.isAnagram("hello", "world");
    }

}
