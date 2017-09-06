package Strings;

/**
 * Created by rupeshkb on 7/18/17.
 */
public class LongestCommonSubString {
    public static void main(String[] args) {
        String A = "tutorialhorizon";
        String B = "dynamictutorialProgramming";

        System.out.println(longestCommonSubString(A.toCharArray(), B.toCharArray()));

    }

    public static int longestCommonSubString(char str1[], char str2[]){
        int T[][] = new int[str1.length+1][str2.length+1];
        int max = 0;
        for(int i=1; i <= str1.length; i++){
            for(int j=1; j <= str2.length; j++){
                if(str1[i-1] == str2[j-1]){
                    T[i][j] = T[i-1][j-1] +1;
                    if(max < T[i][j]){
                        max = T[i][j];
                    }
                }
            }
        }
        return max;
    }
}
