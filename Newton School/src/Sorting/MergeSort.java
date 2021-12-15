package Sorting;

public class MergeSort {

    private MergeSort() {
    }

    private static void merge(int[] a, int[] auxArray, int lowIndex, int midIndex, int highIndex) {
        // copy to auxArray[]
        for (int k = lowIndex; k <= highIndex; k++) {
            auxArray[k] = a[k];
        }

        int i = lowIndex, j = midIndex + 1;
        for (int k = lowIndex; k <= highIndex; k++) {
            //Pointer for left sub-arry has crossed mid, pick from right sub-array
            if (i > midIndex)
                a[k] = auxArray[j++];
                //Pointer of right sub-array has cross the end of array, pick from left sub-array
            else if (j > highIndex)
                a[k] = auxArray[i++];
                //Pointer are all Ok, if element of right sub-array less than right sub-array element
            else if (auxArray[j] < auxArray[i])
                a[k] = auxArray[j++];
                //Pointer are all Ok, if element of left sub-array less than right sub-array element
            else a[k] = auxArray[i++];
        }
    }
    //3 5 7 9      6 8

    //3  5  6 7  8 9
    private static void sort(int[] a, int[] auxArray, int lo, int hi) {
        //If the high position is less than or equal to low position then we are
        //the middle of the array
        if (hi <= lo) return;
        //lo = 0   hi 17
        //mid = 8
        int mid = lo + (hi - lo) / 2;
        sort(a, auxArray, lo, mid);   //sort from position low to mid
        sort(a, auxArray, mid + 1, hi);  //sort from mid + 1 to end of array
        merge(a, auxArray, lo, mid, hi);
    }

    //Entry point into the sorting logic
    public static void sort(int[] a) {

        //Auxilary/temporary array to store results of work done
        int[] auxArray = new int[a.length];

        //Calll to overloaded sort method on line 24
        sort(a, auxArray, 0, a.length - 1);
    }

    public static void main(String[] args) {
        int[] arrayToSort = {1, 3, 5, 2, 8};

        sort(arrayToSort);

        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.println(arrayToSort[i]);
        }
    }
}