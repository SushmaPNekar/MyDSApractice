package Collections;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();

      //  Character str = input.toCharArray();
        char[] chaArr1 = input1.toCharArray();
        char[] chaArr2 = input2.toCharArray();

       // int i = input.length() -1;
        for(int i =0;i<input1.length();i++){
            if(chaArr1[i] != chaArr2[i]){
                System.out.println("Not Equal");
                return;
            }
        }
        System.out.println("String are equal");
        //System.out.println(Arrays.toString(reverArray));

    }
}
