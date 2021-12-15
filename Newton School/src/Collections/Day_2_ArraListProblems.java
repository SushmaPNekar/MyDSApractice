package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Day_2_ArraListProblems {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(10);

        arr.add("one");
        arr.add("two");
        arr.add("three");
        arr.add("four");
        arr.add("five");
        arr.add("six");
        arr.add("seven");
        arr.add("8");
        arr.add("9");
        arr.add("10");
        arr.set(3,"3");

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(11);
        arr2.add(12);
        arr2.add(3);









        AddElements(arr,4,"Sushma");
        System.out.println(arr.get(4));
        System.out.println("Element at index 8 is " + arr.get(8));
        System.out.println("Element at index 3 is " + arr.get(3));
        Collections.sort(arr2);
        System.out.println(arr2);

    }

    private static void AddElements(List<String> ArrayToAdd, int indexToAdd, String stringToAdd){
        ArrayToAdd.set(indexToAdd,stringToAdd);
    }
}
