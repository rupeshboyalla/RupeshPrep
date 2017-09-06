package Strings;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 *
 *
 */
public class RepeatedSubStrings {

    public static void main(String[] args) {

    }

    public static Set<String> getRepeatedSubstrings(String input, int len){
        Set<String> unique = new HashSet<String>();
        Set<String> res = new TreeSet<String>();
        int lastIdx = input.length() - len;
        for (int i = 0; i <= lastIdx; i++) {
            String substr = input.substring(i, i + len);
            if (!unique.add(substr)) {
                res.add(substr);
            }
        }
        return res;
    }

}
