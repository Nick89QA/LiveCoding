package hackerRank.staticBlock;

import java.util.Scanner;

/**
 * площадь паралелограмма вычислить и если значения выше нуля тогда выполянть условие
 * если нет то показать сообщение
 */
public class Solution {

    static int breath;
    static  int height;
     static boolean res;

    static {
        Scanner sc = new Scanner(System.in);
        breath = sc.nextInt();
        height = sc.nextInt();
        res = (breath >0 && height >0); // в булиан переменную ложим условие в виде результата больше нуля

        if(!res) { //если результат меньше нуля то выводим сообщение
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
     if (res) { //если результат как указано в булиан значит происходит формула которая внутри + вывод результата
         int  area = breath * height;
         System.out.println(area);
     }


    }
}


