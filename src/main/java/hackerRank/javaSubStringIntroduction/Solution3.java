package hackerRank.javaSubStringIntroduction;

/**
 * нахождение лексикографической наименьшей и наибольшей подстроки длинна k в строке s.
 */

public class Solution3 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

       for (int i = 1; i<=s.length() - k; i++) {
           String substring = s.substring(i, i + k);//присваиваем переменной string подстроку

 // срвниваем текущую подстроку с наименьшей и наибольшей
           if (substring.compareTo(smallest) < 0) {
               smallest = substring;
           } else if (substring.compareTo(largest) > 0 ) {
               //если текущая подстрока лексикографически больше, обновляем значение наибольшей подстроки
               largest = substring;
           }
       }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {

        System.out.println(getSmallestAndLargest("fsfsfsfsfsdf", 6));

        }
    }

