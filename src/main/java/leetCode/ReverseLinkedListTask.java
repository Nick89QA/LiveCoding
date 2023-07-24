package leetCode;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Учитывая заголовок односвязного списка, переверните список и верните перевернутый список.
 */

public class ReverseLinkedListTask {

    public static void main(String[] args) {





/////////----перевернуть linkedList---////////////////////////
        LinkedList<Integer> list = new LinkedList<>();
        list.add(22);
        list.add(11);
        list.add(333);
        list.add(55);
        System.out.println("Список list " + list);

        Collections.reverse(list);

        System.out.println("Перевернутый лист" + list);
     }
    }


