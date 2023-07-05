package stepikCourse.Java.generics;

import java.util.ArrayList;

public class GenericMethod {

    public static void main(String[] args) {
       //создали arraylist с типом string
        ArrayList<String> alStr = new ArrayList<>();
        alStr.add("Yes");
        alStr.add("Deal");
        alStr.add("How are you");
       //cоздали arraylist с типом int
        ArrayList<Integer> alInt = new ArrayList<>();
        alInt.add(33);
        alInt.add(11);
        int a = GenMet.getSecondElement(alInt);
        String str = GenMet.getSecondElement(alStr);
        System.out.println("Generic Type int " + a);
        System.out.println("Generic Type str " + str);
    }
}

/**
 * T это return type, <T> это generic
 */
 class GenMet {
    public static <T> T getSecondElement(ArrayList<T> al) { //в параметрах arrayList какого то типа
        return al.get(1);
    }
}