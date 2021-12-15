package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arrTOSOrt = {6,2,4,8,1,3};
        selectionSort(arrTOSOrt);
        System.out.println(Arrays.toString(arrTOSOrt));

    }
    private static void selectionSort(int[] arr){
        for(int i= 0;i<arr.length;i++){
            int min = i;
            for(int j = i+1;j< arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;

                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
