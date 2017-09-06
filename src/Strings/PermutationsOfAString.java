package Strings;

import java.util.ArrayList;

/**
 * Created by rupeshkb on 9/2/17.
 */
public class PermutationsOfAString {

    public static void main(String[] args) {
        PermutationsOfAString ps = new PermutationsOfAString();
        ps.permutation("abc");

    }

    public ArrayList<String> permutation(String s){
        ArrayList<String> list = new ArrayList<>();
        generatePermutation("", "abc", list);
        for(String ss : list){
            System.out.println(ss);
        }
        return list;
    }

    public void generatePermutation(String prefix, String suffix, ArrayList<String> list){
        if(suffix.length() == 0){
            list.add(prefix);
        }else {
            for(int i =0; i<suffix.length(); i++){
                generatePermutation(prefix+suffix.charAt(i),
                        suffix.substring(0,i)+suffix.substring(i+1, suffix.length()), list);
            }
        }

    }

}
