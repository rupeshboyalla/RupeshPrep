package Strings;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/**
 * Created by rupeshkb on 6/26/17.
 */
public class FindLatestVersion {

    public static void main(String[] args) {

        findLatestVersion("3.2.1", "3.2.2");

    }


    public static String findLatestVersion(String s1, String s2) {
        StringTokenizer st1 = new StringTokenizer(s1, ".");
        StringTokenizer st2 = new StringTokenizer(s2, ".");
        while (st1.hasMoreElements() || st2.hasMoreElements()) {
            long strValue1;
            long strValue2;
            try {
                strValue1 = Long.parseLong(st1.nextToken());

            } catch (NoSuchElementException e) {
                strValue1 = 0l;
            }
            try {
                strValue2 = Long.parseLong(st2.nextToken());

            } catch (NoSuchElementException e) {
                strValue2 = 0l;
            }


            if (strValue1 > strValue2)
                return s1;
            else if (strValue2 > strValue1)
                return s2;

        }

        return s1;

    }


}
