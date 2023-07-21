package stepikCourse.Java.wrapperClass;

import java.util.ArrayList;

public class TestToString {

    public static void main(String[] args) {
        /**
         * "autoboxing" примитивный тип который конверитирован в ссылочный тип в arrayList
         * "unboxing" это конвертирование обьекта
         */
        ArrayList <Integer> list = new ArrayList<>();
        list.add(6);
        int a = list.get(0);

        TestToString t = new TestToString();
        System.out.println( t.toString());
        System.out.println(a);

      ////метод Parse //////////////
        String s1 = "50";
        int i1 = Integer.parseInt(s1);
        System.out.println("Parse " + i1);

        String s2 = "ewewewew";
        Boolean b1 = Boolean.parseBoolean(s2);
        System.out.println("Boolean " + b1);

        //// метод ValueOf ///////////////

        Integer i3 = Integer.valueOf(10);
        System.out.println( "ValueOf " + i3);

    }

    public String toString () {
     return "Car color black";
    }
}
