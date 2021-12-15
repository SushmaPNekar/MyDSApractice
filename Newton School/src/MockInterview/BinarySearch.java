package MockInterview;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr,0,arr.length,5));

    }
    private static boolean binarySearch(int[] arr,int start,int end,int val){
        if(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == val){
                return  true;
            }
            else if(arr[mid] > val){
                return binarySearch(arr,start,mid-1,val);
            }else{
                return binarySearch(arr,mid+1,end,val);
            }
        }
        return false;
    }
}
