package LeetCode_Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a digit string, return all possible letter combinations that the number could represent.

 A mapping of digit to letters (just like on the telephone buttons) is given below.



 Input:Digit string "23"
 Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 *
 */
public class LetterCombinationsOfAPhoneNumber {



    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber lcb = new LetterCombinationsOfAPhoneNumber();
        List<String> list = lcb.letterCombinations("23");
        System.out.println();
    }

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits == null || digits.length() ==0)
            return list;
        Map<Character, String > map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
       char[] digits_array = digits.toCharArray();
        String target1 = null;
        String target2 = null;
       if(digits_array.length ==2) {
           target1 = map.get(digits_array[0]);
           target2 = map.get(digits_array[1]);
       }
        if(target2 == null){
            list.add(target1);
            return list;
        }


        for(int i=0; i<target1.length(); i++){
            for (int j=0; j< target2.length(); j++){
                StringBuffer sb = new StringBuffer();
                list.add(sb.append(target1.charAt(i)).append(target2.charAt(j)).toString());
            }
        }

        return list;

    }
}
