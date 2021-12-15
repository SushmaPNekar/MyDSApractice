package MockInterview;

public class ReversingString {
    public static void main(String[] args) {
        String s1 = "I am a java developer";

        int l = 0;
        int h = 0;
        String res ="";
        for(int i=0;i<=s1.length()-1;i++){


            if(s1.charAt(i) == ' '){
                String sub = s1.substring(l,h);
                for(int j= sub.length()-1;j >= 0;j--){
                    res = res + sub.charAt(j);
                }
                res = res + " ";
                l = h+1;

            }
            else if(i ==s1.length()-1){
                String sub = s1.substring(l);
                for(int j= sub.length()-1;j >= 0;j--){
                    res = res + sub.charAt(j);
                }
            }

            h++;


        }

        // yadav.mahima936@gmail.com

        System.out.println(res);
    }
}
