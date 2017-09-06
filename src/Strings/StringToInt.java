package Strings;

/**
 * Created by rupeshkb on 6/23/17.
 */
public class StringToInt {

    public static void main(String[] args) {
        System.out.println(stringToInt("123"));
    }

    public static int stringToInt(String s){
        if(s == null || s.isEmpty())
            return  -1;
        char[] s_array = s.toCharArray();



        int index =0;
        int length = s.length();
        int sum=0;
        boolean isNegative = false;
        if(s_array[0] == '-'){
            index ++;
            isNegative = true;
        }
        if(s_array[0] == '+'){
            index ++;
        }

        for(int i=index ; i < length; i++){
            if(Character.isDigit(s_array[index]))
            sum =sum*10+Character.getNumericValue(s_array[index]);

        }
        if(isNegative){
            sum = 0 - sum;
        }

        return sum;

    }


}
