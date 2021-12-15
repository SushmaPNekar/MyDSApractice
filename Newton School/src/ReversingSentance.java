import java.util.Locale;

public class ReversingSentance {
    public static void main(String[] args) {
        String sentence = "This Is A Sentence";
        Integer sus = 1;

        //System.out.println( sus.);
        

        String res = "";
        int start =0;
        int end =0;
        for(int i=0;i<sentence.length();i++){

            if(sentence.charAt(i) == ' ') {
                String subString = sentence.substring(start,end);
                res = subString + " " +res;
                start = end +1;
            }else if(i == sentence.length()-1){
                String subString = sentence.substring(start);
                res = subString+" " + res;
            }
            end++;

        }
        String res1 = "";
       String UpperCAseSentence = sentence.toUpperCase();
        String res2 = "";

       for(int i=0;i<sentence.length();i++){
           if(sentence.charAt(i) != UpperCAseSentence.charAt(i)){
               res2 = res2 + UpperCAseSentence.charAt(i);
           }else if(sentence.charAt(i) == ' '){
               res2 = res2 + " ";
           }else{
               Character c = sentence.charAt(i);
               res2 = res2+ c.toString().toLowerCase();
           }
       }
        //System.out.println(UpperCAseSentence);


        System.out.println(res2);

        for(int i=0;i<sentence.length();i++){
           char c = sentence.charAt(i);
           res1 = c + res1;

        }
        System.out.println(res1);


        /*for(int i=0;i<axillary.length;i++){
            res = res+axillary[i];
            if(axillary[i] == ' '){
                res = res + " ";
            }

        }*/
        System.out.println(res);

    }
}
