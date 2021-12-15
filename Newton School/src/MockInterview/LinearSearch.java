package MockInterview;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,12,13};
        int elementToSearch = 12;

        for(int i =0;i<arr.length;i++){
            if(arr[i] == elementToSearch ){
                System.out.println("Found " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
