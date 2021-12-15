package TwoDArrays;

public class TwoDArrayDemo {

    public static void main(String[] args) {
        int[][] myArray = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        getAllElements(myArray);
    }

    public static void getAllElements(int[][] arr){
        int row = arr.length;;
        int col = arr[0].length;
        int total = row* col;

        for (int i =0;i<total;i++){
            int presentRow = i/col;
            int presentCol = i%col;
            System.out.println(arr[presentRow][presentCol]);
        }
    }
}
