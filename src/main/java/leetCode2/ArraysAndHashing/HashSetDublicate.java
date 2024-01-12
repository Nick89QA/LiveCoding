package leetCode2.ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class HashSetDublicate {
    public static boolean isDuplicate( int[] nums) {
        Set<Integer> integers = new HashSet<>(); //создаем set в которм хранятся только уникальные числа

        for (int i = 0; i < nums.length;i++) {
            if (!integers.add(nums[i])) {// оператор ! НЕ (логическое отрицание) перед добавлением
                System.out.println("We have duplicate");
                return false;
            }
        }
        System.out.println("We don't have duplicate");
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,23,443,33,3,3,332};
         int[] arr2 = {1,2,3,4,5,6};
        isDuplicate(arr);
         isDuplicate(arr2);

    }

 }
