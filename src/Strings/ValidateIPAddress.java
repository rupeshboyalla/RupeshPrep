package Strings;

/**
 * Validate an IP address (IPv4). A valid IPv4 address must be in the form of XXX.XXX.XXX.XXX,
 * where XXX is a number from 0-255
 *
 *
 * The idea is to split the given IP address into tokens by using dot(.) as a delimiter.
 * If the token size is not equal to 4, we return false else we validate each token.
 * If token is not a number or the numbers are not in the valid range between 0 to 255,
 * we return false. If all tokens are valid, we return true
 */
public class ValidateIPAddress {

    public static void main(String[] args) {
        System.out.println(isValidIP("14.8.9.8"));
    }

    public static boolean isValidIP(String s){
        if(s.length() ==0)
            throw new IllegalArgumentException("Given input string is null");
        String[] s_array = s.split("\\.");

        if(s_array.length != 4 )
            return false;
        for(String s1 : s_array){
            try {
                int value = Integer.parseInt(s1);
                if (value <= 0 || value >= 255) {
                    return false;
                }
            }catch (NumberFormatException e){
                return false;
            }
        }

        return true;

    }

}
