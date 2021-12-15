package StringsProblems;

public class ComparingStrings {
    public static void main(String[] args) {
        String s1 = "Sushma";
        String s2 = "Sushma";
        String s3  =new String("Sushma");

        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1 == s2);


        System.out.println("comparing s1 and s3");
        System.out.println(s1.equals(s3));        //
        System.out.println(s1.compareTo(s3));
        System.out.println(s1 == s3);

    }
}
