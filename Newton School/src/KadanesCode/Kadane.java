package KadanesCode;

public class Kadane {
    public static void main(String[] args) {
        int[] arr = new int[]{-2,-3,4,-1,-2,1,5,-3};

        int max_so_far = Integer.MIN_VALUE;
        int max_here = 0;

        for(int i=0; i<arr.length;i++){
            max_here = max_here + arr[i]; //0+4,3,1,2,7
            if(max_here > max_so_far){
                max_so_far = max_here;      //4,7
            }
            if(max_here <0){
                max_here =0;
            }
        }
        System.out.println(max_so_far);


    }
}
