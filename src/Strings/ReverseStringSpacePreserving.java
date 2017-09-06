package Strings;

/**
 * Created by rupeshkb on 6/23/17.
 */
public class ReverseStringSpacePreserving {
    public static void main(String[] args) {
        System.out.println(reverseString("I Am Not String"));
        System.out.println(reverseString("JAVA JSP ANDROID"));
        System.out.println(reverseString("1 22 333 4444 55555"));
    }

    public static String reverseString(String s){
        if(s.isEmpty())
            return null;

        char[] s_array = s.toCharArray();
          int i=0, j=s.length() -1;
          while(i < j){
              if(s_array[i]== ' ' )
                  i++;
              if (s_array[j]== ' ' )
                  j--;
              char temp = s_array[i];
              s_array[i] = s_array[j];
              s_array[j] = temp;
              i++;
              j--;
          }
          return new String(s_array);
    }


}
