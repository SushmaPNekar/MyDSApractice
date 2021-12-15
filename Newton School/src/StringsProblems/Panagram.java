package StringsProblems;

import java.util.Locale;

public class Panagram {


    public static void main(String[] args) {
        String s  = "The quick brown fox jumped over the lazy dogs";
        isPalindrome(s.toLowerCase());
    }
    private static void isPalindrome(String str){
        int[] intArray = new int[26];

        for(char c : str.toCharArray()){
            if(c != ' ')
                intArray[c - 'a'] += 1;
        }

        for(int i =0;i<26;i++){
            if(intArray[i] == 0){
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("It is a palindrome ");

    }
}
