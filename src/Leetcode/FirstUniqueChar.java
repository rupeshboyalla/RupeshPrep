package Leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by rupeshkb on 8/12/17.
 */
public class FirstUniqueChar {



    public static void main(String[] args) {

        FirstUniqueChar c = new FirstUniqueChar();

        System.out.println(c.firstUniqChar("ababc"));

    }

    public int firstUniqChar(String s) {

        if(s.length() ==0 ){
            return -1;
        }

        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        char[] s_array = s.toCharArray();
        for(char c : s_array){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else
                map.put(c,1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() ==1 ){
                return s.indexOf(entry.getKey());
            }
        }


        return -1;

    }
}
