package stepikCourse.Java.arrays;

import java.util.Arrays;

public class ArrayDynamic {
    static String l = "kfdffffdfdff";
    public static void main(String[] args) {

        String[] array1; //обьявили масив строк
        int[][] array2; // обьявили масив чисел
        int[][] array3;
//// придали масиву длинны
        array1 = new String[3];
        array2 = new int[3][6];
        array3 = new int[5][];


        array3[0] = new int[3];
        array3[1] = new int[1];
        array3[2] = new int[6];

//динамическая инициализация
        for (int i = 0; i < array1.length; i++) {
            array1[i] = "privet" + i;
            System.out.println(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) { // проверка одномерного масива array2
           array2[i][j]=i+j;
                System.out.println(array2[i][j]);
            }
        }

     //смешанные варианты создания массива
        int[] array4 = new int[] {1,3,4};
        String[] a = new String[]{"sdsds","sdsdsds"};
        System.out.println(Arrays.toString(a));
        //////////////////////
        System.out.println("Длинна String " + l.length());
    }
}
