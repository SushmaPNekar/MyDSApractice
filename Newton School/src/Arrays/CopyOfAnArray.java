package Arrays;

import java.util.Arrays;

public class CopyOfAnArray  {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = a;
        //b= a;
        b[0] = 0;
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));
        System.out.println();



    }




}

