package Collections.LinkedListProblems;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class AddElements implements Iterator {
    public static void main(String[] args){
        LinkedList myList = new LinkedList();
        myList.add(4);
        myList.add(5);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        Collections.sort(myList);

        Iterator iter = myList.iterator();

        while (iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
    }



    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
