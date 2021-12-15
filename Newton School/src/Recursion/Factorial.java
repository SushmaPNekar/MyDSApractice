package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorail(20));

    }

    private static long factorail(long num){
        if(num == 1){
            return 1;
        }
        return num * factorail(--num);
    }
}
