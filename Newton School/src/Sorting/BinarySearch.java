package Sorting;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int res = binarySearch(arr,0,arr.length-1,6);
        System.out.println(res);

    }
    private static int binarySearch(int[] arr, int start, int end, int val){
       // String res = "";
        if(start <= end){
            int mid = (start+ end) / 2;
            if(arr[mid] == val){
                return mid;
            }
            else if(arr[mid] > val){
                return binarySearch(arr,start,mid-1,val);

            }
            else{
                return binarySearch(arr,mid+1,end,val);
            }
        }

        return -1;

    }

}
