package stepikCourse.Java.arrays;

public class MaxMinElemInArray {
    /**
     * Поиск минимального brand максимального элемента в массиве
     */

    public static void maxMin(double[] array) {
        double max=array[0];
        double min=array[0];
     for (int i = 1;i< array.length;i++){
         //если какой то элемент больше максимума то он будет присвоен максимальным
         if (array[i] > max) {
             max = array[i];
         }
         //если какой то элемент меньше минимума то он будет присвоен минимуму
         if (array[i] <min) {
             min = array[i];
         }
     }
        System.out.println("Минимальный элемент массива " + min + " Максимальный элемент массива " + max);
    }

    public static void main(String[] args) {
        double[] array = {1.05,33.4,2.3,11.3,55.7};
        maxMin(array);
    }
}
