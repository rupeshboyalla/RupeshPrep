package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * How do you count the number of occurrences of each character in a string.
 */
public class NumberOfOccurrence {

    public static void main(String[] args) {
        countNumberOfOccurrence("Java J2EE Java JSP J2EE");
        System.out.println("================================");
        countNumberOfOccurrence("All Is Well");
        System.out.println("================================");
        countNumberOfOccurrence("Done And Gone");
        System.out.println("================================");
    }

    public static void countNumberOfOccurrence(String s){
        if(s == null || s.isEmpty())
            throw new IllegalArgumentException("input string is null");
        s = s.replaceAll(" ", "");
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        char[] char_array = s.toCharArray();
        for(int i=0; i< s.length(); i++){
            if(map.containsKey(char_array[i])){
                map.put(char_array[i], map.get(char_array[i])+1);
            }else
                map.put(char_array[i], 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +" = " +entry.getValue());

        }

    }


}
