package Strings;

/**
 * Created by rupeshkb on 6/22/17.
 */
public class IsPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrom_rupesh("boyalla"));
    }

    public static boolean isPalindrom(String s){
        if(s.length() ==0 && s.length()/2 ==0)
            return false;
        int i=0;
        int j=s.length() -1;

        while (i< j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }


    public static boolean isPalindrom_rupesh(String s){
        if(s.length() == 0 )
            return false;
        int mid = (s.length()/2)+1;
        int i=0, j= s.length()-1;

        while ( i < mid){
            if(s.charAt(i) != s.charAt(j))
                return false;
            else
                i++;
                j--;
        }

        return true;
    }

}

