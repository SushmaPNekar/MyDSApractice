package Sorting;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {1,5,12,16,3,2};
        System.out.println(linearSearch(arr,12));
    }

    private static int linearSearch(int[] arr, int val){
        for(int i= 0; i< arr.length;i++){
            if(arr[i] == val){
                return i+1;
            }
        }
        return -1;
    }
}
