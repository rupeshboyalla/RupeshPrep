package Strings;

import java.util.StringTokenizer;

/**
 * Created by rupeshkb on 6/26/17.
 *
 *  "abc12 bd13 e1"
 *
 *  O/p: 16
 *
 */
public class StringToIntManipulation {

    public static void main(String[] args) {
        System.out.println(convertToInt("ab12 cd13 d1"));
    }

    public static int convertToInt(String s) {
        int result = 0;
        StringTokenizer st = new StringTokenizer(s, " ");
        while(st.hasMoreElements()){
            int sum =0;
            String st1 = st.nextToken();
            for(int i=0; i< st1.length(); i++){
                char c = st1.charAt(i);
                if(Character.isDigit(c)){
                    sum = sum*10+Character.getNumericValue(c);
                }
            }
            result +=sum;
        }
        return result;
    }
}
