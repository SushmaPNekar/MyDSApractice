package TwoDArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArrayBy90Degree {
    public static void main(String[] args) {
        int[][] myArray = {
                {1,2,3,4},     // 9  5  1
                {5,6,7,8},     // 10 6 2
                {9,10,11,12}   // 11 7 3
        };                      //12 8 4
        int[][] rotatedArray = new int[myArray[0].length][myArray.length];
        //System.out.println(myArray.length);
        //System.out.println(myArray[0].length);

        for (int i = myArray.length-1;i>=0;i--){
            for(int j =0;j< myArray[0].length;j++){
                //System.out.println("Accessing " + i +" - " + j);
                int targetRow = j;
                int targetCol = myArray.length-i-1;
                //System.out.println(targetRow);
                rotatedArray[targetRow][targetCol] = myArray[i][j];

                //System.out.println("Accessing " + i +" - " + j);
                //System.out.println("Filling " + j +" - " + (myArray.length - i - 1));

            }
        }

        int row = rotatedArray.length;
        int col = rotatedArray[0].length;
        int total = row * col;

        for(int i=0;i<row;i++){
            int k = i ;
            int l = i% col;
            System.out.println(Arrays.toString(rotatedArray[k]));


        }

    }


}
