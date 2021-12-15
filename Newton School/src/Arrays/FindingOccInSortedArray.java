package Arrays;

public class FindingOccInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4,5};
       int c=  count(arr,3,arr.length);
        System.out.println(c);
    //    int val = (Integer.MAX_VALUE -1) / 2;
     //   System.out.println(val);
    }

    private static int count(int[] arr, int val,int n){
    //   int count = 0;
        int firstOcc = first(arr,0, arr.length-1, val,n);
        if(firstOcc == -1){
            return -1;
        }
        int lastOcc = last(arr,firstOcc ,n-1,val,n);

        return lastOcc- firstOcc +1;
    }

    private static int first(int[] arr, int s,int l ,int val,int n){
        if(s <= l){
            int mid = s +( l-s )/2;
            if(mid== 0 || arr[mid-1] < arr[mid] && arr[mid] == val){
                return mid;
            }else if(arr[mid] >= val){
                return first(arr,s,mid-1,val,n);

            }else{
                return first(arr,mid+1,l,val,n);

            }

            /*else if(val > arr[mid]){
                return first(arr,mid+1,l,val,n);
            }else{
                return first(arr,s,mid-1,val,n);

            }*/
        }
        return -1;
    }

    private static int last(int[] arr, int s, int l,int val, int n){
        if(s <= l){
            int mid = s + (l-s)/2;
            if(arr[mid] < arr[mid+1] && arr[mid] ==val || mid == n-1){
                return mid;
            }
            else if(arr[mid] > val){
                return last(arr,s,mid-1,val,n);

            }else{
                return last(arr,mid+1,l,val,n);

            }

            /*else if(arr[mid] > val){  // 1 2 3 3 3 4 5
                return last(arr,s,mid-1,val,n);
            }else {
                return last(arr,mid+1,l,val,n);
            }*/
        }
        return -1;
    }
}
