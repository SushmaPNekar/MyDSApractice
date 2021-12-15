package Collections.LinkedListProblems;

import java.util.Iterator;
import java.util.LinkedList;

public class Problem1 {
    public static void main(String[] args) {
        MyLinkedList<String> myList = new MyLinkedList<>();
        Iterator<String> iter = myList.iterator();
        myList.add("One");
        myList.add("two");

        LinkedList m = new LinkedList();
        m.add(1);
        m.add(2);
        m.add(3);
        m.add(4);
        m.add(6);
        System.out.println(m.getFirst());
        Integer num = (Integer) m.getFirst();






    }



}
