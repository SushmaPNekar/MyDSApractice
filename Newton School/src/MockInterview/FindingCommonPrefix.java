package MockInterview;

import java.util.Arrays;

public class FindingCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"lllllll", "taaal", "taal", "tal"};

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        String res= "";
        int min ;
        if(str[0].length() > str[str.length-1].length()){
            min = str[str.length-1].length();
        }
        else{
            min = str[0].length();
        }
        for(int i=0;i<min;i++){
            if(str[0].charAt(i) == str[3].charAt(i) ){
                res = res + str[0].charAt(i);
            }
            else{
                break;
            }

        }
        System.out.println(min);
        System.out.println(res);
    }
}
