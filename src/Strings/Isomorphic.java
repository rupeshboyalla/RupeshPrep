package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 *
 *
 *
 *
 *
 */
public class Isomorphic {


    public static void main(String[] args) {

        System.out.println(isIsomorphic("egg", "att"));

    }


    public static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length())
            return false;
        HashMap<Character, Character> map = new LinkedHashMap<>();
        for (int i=0; i< s.length(); i++){
           if(map.containsKey(s.charAt(i))) {
                if(t.charAt(i) != map.get(s.charAt(i)))
                    return false;
            }else
              //  if(map.containsValue())
                map.put(s.charAt(i), t.charAt(i));
        }

        return true;

    }

}
