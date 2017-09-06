package Strings;

import java.util.StringTokenizer;

/**
 * Created by rupeshkb on 6/22/17.
 */
public class FindDistanceBetweenWords {

    public static void main(String[] args) {
        String str = "I am a good I   boy    ";
        //String str = "I am a good boy.";
        System.out.println(getDistance(str, "am", "boy"));	//4
        System.out.println(getDistance(str, "I", "boy"));	//1
        System.out.println(getDistance(str, "I", "I")); //0
        System.out.println(getDistance(str, "boy", "am")); //-1
        System.out.println(getDistance(str, "bad", "bad")); //-1
        System.out.println(getDistance(str, "good", "bad")); //-1
        System.out.println(getDistance("", null, "")); //-1
        System.out.println(getDistance(str, "", null)); //-1
    }

    public static int getDistance(String str, String t1, String t2){
        if (str == null || t1 == null || t2 == null|| t1.isEmpty() || t2.isEmpty() || str.isEmpty())
            return  -1;
        int distance =0;
        boolean isTargetFound = false;
        String[] strArray = str.split("\\s");
        for(int i=0; i< strArray.length; i++){
            if(strArray[i].equals(t1)){
                distance =0;
                isTargetFound = true;
            }
            if(strArray[i].equals(t2) && isTargetFound){
                return distance;
            }
            distance ++;
        }
        return -1;
    }

}
