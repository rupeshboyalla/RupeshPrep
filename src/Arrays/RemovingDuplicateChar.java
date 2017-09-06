package Arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rupeshkb on 9/5/17.
 */
public class RemovingDuplicateChar {

    public static void main(String[] args) {
        RemovingDuplicateChar rmc = new RemovingDuplicateChar();
        System.out.println(rmc.removeDuplicateChar("hello"));
    }
    public String removeDuplicateChar(String s){
        if (s.length() ==0)
            return s;
        char[] s_array = s.toCharArray();
        Set<Character> set = new HashSet<>();
        StringBuffer sb = new StringBuffer();
        for (char c : s_array){
            if(!set.contains(c)){
                sb.append(c);
                set.add(c);
            }
        }
        return sb.toString();
    }
}
