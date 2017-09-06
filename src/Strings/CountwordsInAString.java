package Strings;

import java.util.StringTokenizer;

/**
 *
 * This program we need to count the given word in a string
 *
 *
 */
public class CountwordsInAString {

    public static void main(String[] args) {
        System.out.println(countWords("hello doctor"));
        System.out.println(countWordsUsingStringSplit("hello doctor"));

    }
    public static int countWords(String word){
        if(word.length() == 0)
            return 0;
        int count =0;
        StringTokenizer st = new StringTokenizer(word, "");
        StringBuffer sb = new StringBuffer();
        while (st.hasMoreTokens()){
            count ++;
            sb.append(st.nextToken()).append(" ");
        }
        return count;
    }

    public static int countWordsUsingStringSplit(String s){
        if(s.length() ==0)
            return -1;
        String[] s_array = s.split("\\s");
        return  s_array.length;
    }
}
