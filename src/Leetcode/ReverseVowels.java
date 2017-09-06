package Leetcode;

/**
 * Given a singly linked list, determine if it is a palindrome.


 Write a function that takes a string as input and reverse only the vowels of a string.

 Example 1:
 Given s = "hello", return "holle".

 Example 2:
 Given s = "leetcode", return "leotcede".

 Note:
 The vowels does not include the letter "y".
 *
 *
 */
public class ReverseVowels {
    public static void main(String[] args) {
        ReverseVowels rv = new ReverseVowels();
        System.out.println(rv.reverseVowels("leetcode"));
    }

    public String reverseVowels(String s){
        if (s.length() == 0)
            return s;
        int i =0, j =s.length()-1;
        char[] s_array = s.toCharArray();
        while (i < j) {
            if (isVowel(s_array[i]) && isVowel(s_array[j])) {
                char temp = s_array[i];
                s_array[i] = s_array[j];
                s_array[j] = temp;
                i++; j--;
            }
                if (!isVowel(s_array[i])) {
                    i++;
                }
                if (!isVowel(s_array[j])) {
                    j--;
                }
            }

        return String.valueOf(s_array);
    }

    public boolean isVowel(char c){
        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;

            default:
                return false;
        }
    }
}
