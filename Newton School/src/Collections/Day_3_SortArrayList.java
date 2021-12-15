package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Day_3_SortArrayList {
    public static void main(String[] args) {
        List<String> Arr = new ArrayList<>();
        Arr.add("One");
        Arr.add("Twoooo");
        Arr.add("Three");
        Arr.add("Four");
        Arr.add("Fiveeeeeee");

          Collections.sort(Arr);
         Collections.sort(Arr,new Day_3_MystringComparator());

         Collections.sort(Arr);
        System.out.println("Default sort");
        for (String s : Arr) {
            System.out.println(s);
        }
        System.out.println("");

        System.out.println("Implementing our own sort");

        for (String s : Arr) {
            System.out.println(s);
        }

    }
}
