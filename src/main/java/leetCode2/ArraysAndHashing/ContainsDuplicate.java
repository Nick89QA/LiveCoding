package leetCode2.ArraysAndHashing;

import java.util.Arrays;

public class ContainsDuplicate {
    // Example
    // Input: [1,2,3,1]
    // Output: true

    /**
     * Сортируем массив методом sort
     * проходим циклом for с условием nums.lenght - 1 чтобы не выйти за пределы массива
     * применяем условие if где сравниваем nums[] == nums[i + 1] где сравниваем текущий элемент со следующим
     */

    public static boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 33, 44, 5};
        System.out.println(containsDuplicate(arr));
    }


}
