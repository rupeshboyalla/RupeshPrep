package Strings;

/**
 * Created by rupeshkb on 6/26/17.
 */
public class LongestSubstringWithoutRepetition {

    private static String word = "abcabcbb";
    public static void main(String [] args){
        System.out.println(getLongestSubstringWithoutRepetition(word));
    }

    private static String getLongestSubstringWithoutRepetition(String word){
        if (word.length() < 1) return null;
        if (word.length() == 1) return word;
        StringBuilder output = new StringBuilder();

        for(int i = 0; i < word.length(); i++){
            if (output.indexOf(String.valueOf(i)) < 0)
                output.append(word.charAt(i));
            else
                output.delete(0, output.length()-1);

        }
        return null;
    }
}
