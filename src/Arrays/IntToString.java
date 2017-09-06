package Arrays;

/**
 * Created by rupeshkb on 6/23/17.
 */
public class IntToString {

    public static void main(String[] args) {
        System.out.println(intToString(123));
    }

    public static String intToString(int num){
        if(num == 0)
            return null;

        StringBuilder sb = new StringBuilder();
        while (num > 0){
            int curr = num%10;
            num = num/10;
            sb.append(curr);


        }
        return sb.reverse().toString();
    }
}
