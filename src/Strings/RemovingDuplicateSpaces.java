package Strings;

import java.util.StringTokenizer;

/**
 * Created by rupeshkb on 6/22/17.
 */
public class RemovingDuplicateSpaces {

    public static void main(String[] args) {
        String str = "String    With Multiple      Spaces";
        System.out.println(removingDuplicateSpaces(str));
    }

    public static String removingDuplicateSpaces(String s){
        if(s.length() == 0)
            return null;
        StringTokenizer st = new StringTokenizer(s, "");
        StringBuffer sb = new StringBuffer();
        String token = null;
        while (st.hasMoreElements()){
            token = st.nextToken();
            System.out.println(token);
            sb.append(token).append("");
        }
        return sb.toString().trim();

    }


}
