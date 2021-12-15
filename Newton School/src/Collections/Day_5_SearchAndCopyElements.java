package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day_5_SearchAndCopyElements {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();

        List<String> to = new ArrayList<>();


        a.add("One");
        a.add("Two");
        a.add("Three");
        a.add("Four");
        a.add("Five");

       // System.out.println(SearchElement(a,"One"));
        //CopyArr(a,to);
        //Shuffle(a);
        GetSubString(a);
    }

    private static Boolean SearchElement(List<String> arr,String ElementToSearch){
        return arr.contains(ElementToSearch);
    }
    private static void CopyArr(List<String> from, List<String> to){
        to.addAll(from);

        for(String s : to){
            System.out.println(s);
        }
    }
    private static void Shuffle(List<String> ListToSHuffle){
        Collections.shuffle(ListToSHuffle);

        for(String s : ListToSHuffle){
            System.out.println(s);
        }
    }
    private static void GetSubString(List<String> ListtoGet){
        List<String > l = ListtoGet.subList(1,4);

        for(String s : l){
            System.out.println(s);
        }
    }


}
