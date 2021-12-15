package MockInterview;

public class StringProblem {
    public static void main(String[] args) {
        String s1= "Sus";
        String s2 =  s1.concat("hma");
        String s3 = s2;
       // System.out.println(s2);


        StringBuffer sb = new StringBuffer("Sus");
        sb.append("hma");
        System.out.println(sb);
    }
}
