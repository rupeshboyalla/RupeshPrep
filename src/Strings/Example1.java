package Strings;

/**
 * Created by rupeshkb on 6/26/17.
 */
public class Example1 {
    public static void main(String[] args) {
        String str = "98";
        int number = 0;

        number = str.charAt(0) - '0';
        number += str.charAt(1) - '0';
        System.out.println(number);

        number = Character.getNumericValue(str.charAt(0));
        number += Character.getNumericValue(str.charAt(1));

        System.out.println(number);
    }
}
