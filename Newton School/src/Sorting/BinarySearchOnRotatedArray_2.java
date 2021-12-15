package Sorting;

public class BinarySearchOnRotatedArray_2 {
    public static void main(String[] args) {
        int[] arr = {1,3};

        int val = 2;
        int res = search(arr,0,arr.length-1,val);
        // 8,9,10,1,2,3,4,5,6,7
        System.out.println( " element is at " + res );

    }
    private static int search(int[] arr,int start,int last,int val){
        int index = findindPivot(arr,start,last);
        System.out.println(index);
        if(index == -1){
            return binarySearch(arr,start,last,val);
        }
        if(arr[index] == val){
            return index;
        }
        if(arr[start] >= val){
            return binarySearch(arr,index+1,last,val);
        }
        return binarySearch(arr,start,index-1,val);



    }
    private static int binarySearch(int[] arr, int start,int last,int val){
        if(start > last){
            return -1;
        }
        int mid = start+(last-start)/2;

        if(arr[mid] == val){
            return mid;
        }
        if(arr[mid] > val){
            return binarySearch(arr,start,mid-1,val);
        }
        return binarySearch(arr,mid+1,last,val);


    }

    private static int findindPivot(int[] arr, int start, int last){
        if(start > last){
            return -1;
        }
        if(start == last ){
            return start;
        }
        int mid = start + (last - start)/2;
//
        if( arr[mid] > arr[mid + 1]){
            return mid+1;
        }



//  5,6,7,1,2,3,4                               1 2 3 3 3 4 5 6
        if(arr[last] <= arr[mid]){
            return findindPivot(arr,mid+1,last);

        }
        return findindPivot(arr,start,mid-1);



    }
}
