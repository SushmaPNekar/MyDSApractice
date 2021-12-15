package KadanesCode;

public class ZeroSum {
    public static void main(String[] args) {
        int[] zeroSum= {1,2,4-2,-1};
        int i =0;
        int zeroSumCount = 0;
        for (i=0;i<zeroSum.length-1;i++){
            if(zeroSum[i] +zeroSum[i+1]==0){
                zeroSumCount++;
            }
            i++;
        }
        System.out.println(zeroSumCount);

    }
}
