package stepikCourse.Java.arrays;

public class MatchingMassive {
    public static void main(String[] args) {
        int[] array1 = {1,3,4,5,4,3,6};
        int[] array2 = {11,23,44,3,55,3,2};
        int array3[] = array2;// array3 ссылается на array2
        System.out.println(array3 == array2); //сравнили 2 массива с помошью "=="
    }
}
