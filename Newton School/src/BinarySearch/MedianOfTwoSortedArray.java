package BinarySearch;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] a1 = {3};
        int[] a2 = {-2,-1};
        System.out.println(findMedianSortedArrays(a1,a2));
        int a = 6;
        System.out.println(2.5/2);

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0 && nums2.length == 1){
            return nums2[0];
        }else if(nums2.length == 0 && nums1.length == 1){
            return nums1[0];
        }

        int[] sorted = merge(nums1,nums2);
        int len = sorted.length;
        double mid;

        if(sorted.length % 2 != 0){
            int res = sorted.length / 2;
            mid = (double) sorted[res];
        }
        else{
            int res =  (sorted[len / 2]) +  sorted[(len / 2) -1];
            mid = (double) res /2;
        }
        return mid;
    }

    public static int[] merge(int[] a1, int[] a2){
        int i =0;
        int j = 0;
        int k = 0;
        int[] merged = new int[a1.length + a2.length];

        while(i < a1.length && j < a2.length){
            if(a1[i] < a2[j]){
                merged[k] = a1[i];
                k++;
                i++;
            }else{
                merged[k] = a2[j];
                j++;
                k++;
            }
        }

        while(i < a1.length){
            merged[k] = a1[i];
            i++;
            k++;
        }
        while(j < a2.length){
            merged[k] = a2[j];
            j++;
            k++;
        }
        return merged;
    }





}
