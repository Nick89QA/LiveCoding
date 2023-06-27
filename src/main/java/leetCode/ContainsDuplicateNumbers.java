package leetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * Учитывая целочисленный массив nums,
 * вернуть true, если какое-либо значение встречается в массиве не менее двух раз,
 * и вернуть false, если каждый элемент различен.
 */


public class ContainsDuplicateNumbers {

    public static boolean containsDuplicate(int[] nums) { //создали статичный метод который принимает масив чисел
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i <nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            }
        uniques.add(nums[i]);
        }
    return false;
    }

    public static void main(String[] args) {
        int[] numbersDuplicate = {1,1,1,2,3,4,5}; //создали массив с дубликатами
        int[] numbersUnique = {1,2,3,4,5,6}; //создали массив с уникальными числами
        boolean massiveWithDuplicate = containsDuplicate(numbersDuplicate);
        boolean massiveWithUnique = containsDuplicate(numbersUnique);
        System.out.println(massiveWithDuplicate);
        System.out.println(massiveWithUnique);

    }
}



