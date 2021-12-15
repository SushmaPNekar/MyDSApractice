import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,6,3};
        int[] copyArra = new int[arr.length];


        for(int i=0; i<arr.length;i++){
            int count = 0;
            for(int j =i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    int dup = i;
                    count++;
                }

            }
            if(count >0){
                System.out.println("Duplcate at "+"j" + " that is " +  arr[i]);
            }
            copyArra[i] = arr[i];
        }

        System.out.println(Arrays.toString(copyArra));
    }
}
