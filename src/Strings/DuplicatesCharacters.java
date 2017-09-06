package Strings;

import java.util.HashSet;

/**
 * Created by rupeshkb on 6/23/17.
 */
public class DuplicatesCharacters {
    public static void main(String[] args) {
        duplicatesCharInString("Hello Java");
    }

    public static void duplicatesCharInString(String s){
        if(s == null || s.isEmpty())
            throw new IllegalArgumentException("input string can't be empty");
        HashSet<Character> set = new HashSet<>();
        char[] char_array = s.toCharArray();
        for(char c : char_array){
            if(set.contains(c)){
                System.out.println(c);
            }else
                set.add(c);
        }
    }
}
