package Sorting;


public class BitonicSequence {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11};
        int val = 12;
        System.out.println(solve(arr,val));
    }

        public static int solve(int[] A, int B) {
            int len = A.length -1;
            int index = findBitonicPoint(A,len,0,A.length-1);
            int x = search(A,len,index,B);
            return x;



        }
        public static int search(int[] arr, int n, int bitIndex , int val){

            if(arr[bitIndex] == val ){
                return -1;
            }

            if(arr[bitIndex] < val){
                return -1;
            }
            int temp = ascedingSearch(arr,0,bitIndex-1,val);
            if(temp != -1){
                return temp;
            }
            return descedingSearch(arr,bitIndex+1,n,val);
        }

        public static int ascedingSearch(int[] arr, int s,int l , int val){
            if(s <= l){
                int mid = s + (l-s)/2;
                if(arr[mid] == val){
                    return mid;
                }
                else if(arr[mid] > val){
                    return ascedingSearch(arr,s,mid-1,val);
                }else{
                    return  ascedingSearch(arr,mid+1,l,val);
                }
            }
            return -1;
        }

        public static int descedingSearch(int[] arr, int s,int l , int val){
            if(s <= l){
                int mid = s + (l-s)/2;
                if(arr[mid] == val){
                    return mid;
                }
                else if(arr[mid] > val){
                    return descedingSearch(arr,mid+1,l,val);
                }else{
                    return  descedingSearch(arr,s,mid-1,val);
                }
            }
            return -1;
        }


        public static int findBitonicPoint(int[] arr,int n, int start ,int end){
            int mid = start + (end-start)/2;
            int bit = 0;
            if(arr[mid] > arr[mid +1] && arr[mid] > arr[mid-1]){
                return mid;
            }

            else {
                if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid + 1]){
                    bit =  findBitonicPoint(arr ,n, mid ,end);
                }
                else{
                    if(arr[mid] < arr[mid-1] && arr[mid] > arr[mid + 1]){
                        bit =  findBitonicPoint(arr,n, start, mid);
                    }
                }
            }
            return bit;
        }

    }




