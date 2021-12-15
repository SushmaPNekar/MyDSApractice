package Arrays;

import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        rotate(arr,k, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    private static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];

            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void rotate(int[] arr,int k,int n){
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
}
