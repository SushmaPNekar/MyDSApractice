package BinarySearch;

public class SearchInRotatedArray {

        public static void main(String[] args) {
            int[] arr = { 4,5,6,7,0,1,2,30};
            int i = search(arr,0,arr.length-1,0);
            System.out.println(i);
            // 8,1,2,3,4,5,6,7
            // 7,8,1,2,3,4,5,6

            // 3,4,5,6,7,8,1,2
        }

        private static int search(int[] arr, int l, int r,int val){
            if(l > r){
                return -1;
            }

            int mid = l+(r-l)/2;
            if(arr[mid] == val ){
                return mid;
            }

            if(arr[l] <= arr[mid]){
                if(val >= arr[l] && val <= arr[mid]){
                    return  search(arr,l,mid-1,val);
                }else{
                    return  search(arr,mid+1,r,val);
                }
            }
            else{
                if(val >= arr[mid] && val <= arr[r]){
                    return search(arr,mid+1,r,val);
                }else{
                    return search(arr,l,mid-1,val);
                }
            }
        }
    }

