package Arrays;

/**
 *
 * converting Integer to roman
 *
 */
public class IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(IntegerToRoman(1650));
    }
    public static String IntegerToRoman(int num){
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] str = {"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int temp = num;
        StringBuffer sb = new StringBuffer();
        for(int i=0; i< value.length; i++){
            if(temp >= value[i]){
                temp -= value[i];
                sb.append(str[i]);
            }
        }
        return sb.toString();
    }
}
