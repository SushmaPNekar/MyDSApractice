package Sorting;

import java.util.Arrays;

public class MergeSortSimpleWay  {
    public static void main(String[] args) {
        int[] arr = {4,6,-1,3,-8};
        sort(arr);
      /*  Integer[] arrr = new Integer[5];
        int[] ar = arr.clone();
        ar[0] = 0;
*/



        System.out.println(Arrays.toString(arr));

    }
    private static void merge(int[] a,int[] auxArr,int low,int mid,int high){
        for(int k = low;k<=high;k++){
            auxArr[k] = a[k];
        }
        int i = low; int j = mid+1;
        for(int k = low;k<=high;k++){
            if(i > mid){
                a[k] = auxArr[j++];
            }else if(j > high){
                a[k] = auxArr[i++];
            }else if(auxArr[j] < auxArr[i]){
                a[k] = auxArr[j++];
            }else{
                a[k] = auxArr[i++];
            }
        }


    }

    private static void sort(int[] arr){
        int[] auxArray = new int[arr.length];

        sort(arr,auxArray,0,arr.length-1);
    }
    private static  void sort(int[] a , int[] auxArray, int low, int high){
        if(high <= low) return;
        int mid = (high+low)/2;
        sort(a,auxArray,low,mid);
        sort(a,auxArray,mid+1,high);
        merge(a,auxArray,low,mid,high);
    }




}
