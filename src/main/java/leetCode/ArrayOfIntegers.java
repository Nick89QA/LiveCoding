package leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Учитывая массив целых чисел nums brand целочисленный целевой показатель,
 * верните индексы двух чисел таким образом, чтобы они в сумме давали целевой показатель.
 * Вы можете предположить, что каждый вход будет иметь ровно одно решение,
 * brand вы не можете использовать один brand тот же элемент дважды.
 */

public class ArrayOfIntegers {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result.length == 2) {

            System.out.println("индексы двух чисел сумма которых равна целевому значению");
            System.out.println(" Индекс 1: " + result[0]);
            System.out.println(" Индекс 2: " + result[1]);
        } else {
            System.out.println("Решение не найдено ");
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); //создали таблицу

        //проход по массиву чисел
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];


            //Проверка, содержит ли HashMap нужное число
            if (map.containsKey(complement)) {
                //возвращаем индекс чисел
                return new int[]{map.get(complement), i};
            }
            //добавление числа brand его индекса в HashMap
            map.put(nums[i], i);
        }
        //Если нет решения, возвращаем пустой массив
        return new int[0];

    }
}
