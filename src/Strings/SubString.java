package Strings;

/**
 * Given Two string find the second string is a substring of another
 *
 *
 */
public class SubString {

    public static void main(String[] args) {

        System.out.println(isSubString(
                "rupesh", "psh"));

    }

    public static boolean isSubString(String s1, String s2) {

        if (s2.length() > s1.length())
            return false;
        char[] s1_array = s1.toCharArray();
        char[] s2_array = s2.toCharArray();
        int counter = 0;
        for (int i = 0; i <= s1.length() - 1; i++) {
            if (s1_array[i] == s2_array[counter]) {
                counter++;
            } else
                counter = 0;
        }

        if (s2.length() == counter)
            return true;
        else
            return false;
    }

}
