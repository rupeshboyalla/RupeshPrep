package Leetcode;

/**
 *
 * You are given a string representing an attendance record for a student. The record only contains the following three characters:

 'A' : Absent.
 'L' : Late.
 'P' : Present.
 A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

 You need to return whether the student could be rewarded according to his attendance record.

 Example 1:
 Input: "PPALLP"
 Output: True
 Example 2:
 Input: "PPALLL"
 Output: False
 */
public class StudentAttendanceRecord {
    public static void main(String[] args) {
        StudentAttendanceRecord sd = new StudentAttendanceRecord();
        System.out.println(sd.checkRecord("PPALLP"));
    }

    public boolean checkRecord(String s) {
        if(s.length() ==0 )
            return false;
        boolean isAbsent = false;
        boolean isLate = false;
         char[] s_array = s.toCharArray();
         for(int i=0; i< s.length(); i++) {
             switch (s_array[i]) {
                 case 'P':
                     break;
                 case 'A':
                     if (!isAbsent) {
                         isAbsent = true;
                     } else
                         return false;
                     break;
                 case 'L':
                     if (!isLate) {
                         int temp = i;
                         if (s_array[temp] == s_array[--temp]) {
                             isLate = true;
                         }
                     } else
                         return false;
                     break;
             }

         }

        return true;

    }
}
