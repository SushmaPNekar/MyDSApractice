package Collections;

import java.util.*;

public class Day_1 {
    public static void main(String[] args) {
        ArrayListAtWork();
        //  HashSetAtWork();


    }

    private static void ArrayListAtWork() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("one");
        arrayList.add("tow");


        for(int i=0;i<arrayList.size();i++){
            //System.out.println(arrayList.get(i));
        }

        Iterator myArrayIterator= arrayList.iterator();

        while(myArrayIterator.hasNext()){
            System.out.println(myArrayIterator.next());
        }

        arrayList.subList(0,1);
        System.out.println(arrayList.subList(0,1));



    }

        private static void HashSetAtWork () {
            HashSet hashSet = new HashSet();
            hashSet.add("one");
            hashSet.add("tow");
            hashSet.add("Three");
            hashSet.add("Four");
            hashSet.add("FIve");


            Iterator iter = hashSet.iterator();

            while (iter.hasNext()) {
                System.out.println(iter.next());
            }


        }
    }
