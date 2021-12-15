package StringsProblems;

public class LongestDistinctSubString {
    public static void main(String[] args) {
        String s = "avaaavvvavb";

        getChar(s);

    }

    private static void getCount(String s){

    }

    private static void getChar(String s) {


        int maxCount = 0;

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            String res = "";
            for (int j = i; j < s.length(); j++) {
                Character toCheck =  s.charAt(j);
                if (! res.contains(toCheck.toString())) {
                    res = res + toCheck;

                  //  res.concat(toCheck.toString());
                    count++;
                } else {
                 //   System.out.println(res);

                    break;
                }

            }


         //   System.out.println(res);
            if (count > maxCount) {
                maxCount = count;
                System.out.println(res);
            }


        }
        System.out.println(maxCount);

    }
}
