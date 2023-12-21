package hackerRank.palindrom;

import java.util.Scanner;

public class Solution {


    public static boolean isPalindrome(String str) {
        String lowerCaseStr = str.toLowerCase(); //строку преобразовываем в нижний регистр
        int length = lowerCaseStr.length();// сохраняем количество символов строки

        for (int i = 0; i < length / 2; i++) { // идем с начала и с конца строки к центру

            if (lowerCaseStr.charAt(i) != lowerCaseStr.charAt(length - i - 1)) {
                return false;
            }

        }

        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        if (isPalindrome(A)) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }

    }

}
