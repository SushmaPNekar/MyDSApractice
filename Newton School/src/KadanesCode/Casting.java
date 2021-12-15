package KadanesCode;

public class Casting {
    public static void main(String[] args) {
        // This is called Data loss
        int i = 3222;
        byte b = (byte) i;


        /// This is called Truncation - decimal part of float and double are dropped from int and long
        System.out.println(b);
    }
}
