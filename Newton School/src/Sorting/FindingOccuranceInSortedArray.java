package Sorting;

public class FindingOccuranceInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,3,4,5};
        System.out.println(occ(arr,0, arr.length-1,2));


    }
    private static int findingOccu(int[] a,int s, int l,int val){
        if(s <= l){
            int mid = s + (l-s)/2;

            if(a[mid] == val){
                return mid;
            }
            else if(a[mid] > val){
                return findingOccu(a,s,mid-1,val);
            }
            else{
                return  findingOccu(a,mid+1,l,val);
            }
        }
        return -1;
    }

    private static int occ(int[] a, int s, int l, int val){
        int index = findingOccu(a,s,l,val);
        if(index == -1){
            System.out.println("ELement doesn't exist");
            return -1;
        }
        int count = 1;
        int left = index -1;
        while(left >= 0 && a[left] == val){
            count++;
            left--;
        }
        int right = index + 1;
        while (right <= l && a[right] == val){
            count++;
            right++;
        }
        return count;
    }
}
