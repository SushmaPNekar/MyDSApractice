package Arrays;

public class FindingRotationCountByBinarySearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};  // 1,2,3,4,5,6
        // 6,1,2,3,4,5
        //5,6,1,2,3,4
        //4,5,6,1,2,3
        // 3,4,5,6,1,2
        System.out.println(findCount(arr,0,arr.length-1));
    }
    private static int findCount(int[] arr,int start, int end){
        if(start > end ){
            return 0;
        }
        if(start == end){
            return start;
        }

        int mid = start + (end - start)/2;
        if(arr[mid] > arr[mid + 1]){
            return mid+1;
        }
        if(arr[mid] < arr[mid -1]){
            return mid;
        }

        if(arr[end] <= arr[mid]){
            return findCount(arr,mid+1,end);

        }
       return findCount(arr,start,mid-1);





    }
}
