package MockInterview;

public class EqualStrings {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "";
        String s3 = new String("Su");
       // System.out.println(s1.equals(s3));
        //System.out.println(s1 == s2);
       // System.out.println(Character.getNumericValue('a'));
     //  System.out.println(Character.getNumericValue('B'));
     //   System.out.println(s1.charAt(0) - s2.charAt(0));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.equals(s1));
    }
}
