package BinarySearch;

public class FindingMinInSorted {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3,3,3,3,1,3};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] nums) {
        int index = search(nums,0,nums.length-1 );
        return nums[index];
    }

    public static int search(int[] arr, int start, int end){
        if(start > end){
            return 0;
        }
        if(start == end){
            return start;
        }
        int mid = start + (end - start)/2;

        if(mid < end && arr[mid] > arr[mid +1]){
            return mid+1;
        }

        if(mid > start && arr[mid] < arr[mid-1]){
            return mid;
        }

// 5,1,2,3,4
        // 3,4,5,1,2
        // 1,3,3
        else if(arr[end] <= arr[mid] ){
            return search(arr,mid+1,end);
        }else{
            return search(arr,start,mid-1);

        }
    }
}
