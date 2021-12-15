package Arrays;

public class FindingMinElInSortedArray {
    public static void main(String[] args) {
        int[] arr ={1,3,3};
        int ele = findMin(arr);
        System.out.println(ele);
    }

        public static int findMin(int[] nums) {
            int index = minElIndex(nums,0,nums.length-1);
            return nums[index];


        }

        private static int minElIndex(int[] arr, int start, int end){
            if(start > end){
                return start;
            }
            if(start == end){
                return start;
            }

            int mid = start + (end - start)/2;
            if(end == 0){
                return 0;
            }
            if(end == 1){
                if(arr[0] < arr[1]){
                    return 0;
                }else{
                    return 1;
                }
            }

            if(arr[mid] < arr[mid -1]){
                return mid;
            }
            if(arr[mid] > arr[mid+1]){
                return mid+1;
            }                                                 // 5,1,2,3,4   4,5,1,2,3  11,12,13,14,15
            if(arr[end] <=  arr[mid]){                        // (arr[start]  <=  arr[mid])
                                                             //   minElIndex(arr,mid+1,end);
                return minElIndex(arr,mid+1,end);
            }
            return minElIndex(arr,start,mid-1);
        }
    }
