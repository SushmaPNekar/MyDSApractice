package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-4,5,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void bubbleSort(int[] arr){
        boolean isSorted = true;
        for(int i=0;i< arr.length;i++){
            for(int j=1;j< arr.length;j++){
                if(arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                    isSorted = false;
                }
            }
            if(isSorted){
                return;

            }
        }


    }

    private static void swap( int[] arr,int FirstEl ,int SecEl){
        int s = arr[FirstEl];
        arr[FirstEl] = arr[SecEl];
        arr[SecEl] = s;

    }
}
