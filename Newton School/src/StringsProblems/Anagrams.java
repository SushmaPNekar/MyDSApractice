package StringsProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "naman";
        String s2 = "manan";
     //   CheckForAnagrams(s1,s2);
        //System.out.println(Character.getNumericValue('a'));
      //  System.out.println('a' - 'b');
        CheckForAnagramsByHashMap(s1,s2);

    }
    private static void CheckForAnagrams(String s1, String s2){
        if(s1.length() != s2.length()){
            System.out.println("No");
            return;
        }
        int[] tempArr1 = new int[26];
        int[] tempArr2 = new int[26];

        for(char c : s1.toCharArray()){
            tempArr1[c-'a'] +=1;
        }
        for(char c : s2.toCharArray()){
            tempArr2[c-'a'] +=1;
        }
        for(int i=0;i<26;i++){
            if(tempArr1[i] != tempArr2[i]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes They are");
        System.out.println(Character.getNumericValue('a'));
        //System.out.println(Arrays.toString(tempArr1));
        //System.out.println(Arrays.toString(tempArr2));


    }
    private static void CheckForAnagramsByHashMap(String s1, String s2){
        Map<Character, Integer>  occ = new HashMap<Character,Integer>();
        Map<Character, Integer>  occ1 = new HashMap<Character,Integer>();
       // System.out.println(occ.get('a'));
       // System.out.println(occ.keySet());

        for(char c : s1.toCharArray()){
            Integer count = occ.get(c);
            if(count != null){
                occ.put(c,count+=1);
            }
            else{
                System.out.println(count);
                occ.put(c,1);
            }
        }
        for(char c : s2.toCharArray()){
            Integer count = occ1.get(c);
            if(count != null){
                occ1.put(c,count+=1);
            }
            else{
                occ1.put(c,1);
            }
        }

        for(Character c : occ.keySet()){
            System.out.println(c);
            System.out.println(occ.get(c));
            if(occ.get(c) != occ1.get(c)){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }



    }
