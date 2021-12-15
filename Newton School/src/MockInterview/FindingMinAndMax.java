package MockInterview;

public class FindingMinAndMax {
    public static void main(String[] args) {
        int[] arr = {700, 7, 9, 21,4, 1,8,54};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i= 0;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println("Max " + max);
        System.out.println("Min " + min );
    }
}
