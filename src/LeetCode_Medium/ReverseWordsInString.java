package LeetCode_Medium;

/**



 Given an input string, reverse the string word by word.

 For example,
 Given s = "the sky is blue",
 return "blue is sky the".
 */
public class ReverseWordsInString {
    public static void main(String[] args) {
        ReverseWordsInString rw = new ReverseWordsInString();
        System.out.println(rw.reverseWords(" a"));
    }

    public String reverseWords(String s) {
        if(s.length() <=1 || s.isEmpty())
            return s;
        String[] s_array = s.split("\\s");
        int start =0, end = s_array.length-1;
        while (start <= end){
            String temp = s_array[start];
            s_array[start] = s_array[end];
            s_array[end] = temp;
            start++;
            end--;
        }
        return String.join("" ,s_array);
    }
}
