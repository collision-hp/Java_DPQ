// input= "abdbbcacabd";
// output="cabd"

import java.util.HashSet;
import java.util.*;

public class Distinct_SubString {
    public static String Distinct(String str) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        String strfinal=str;
        for (int i = 0; i < str.length() - set.size() + 1; i++) {
            Set<Character> substr = new HashSet<>();
            for (int j = i; j < str.length(); j++) {
                substr.add(str.charAt(j));
                if (substr.size() == set.size()) {
                    String sub = str.substring(i, j + 1);
                    if(sub.length()<strfinal.length()){
                        strfinal=sub;
                    }
                    break;
                }
            }
        }
        return strfinal;
    }

    public static void main(String[] args) {
        String str = "abdbbcacabd";
        String str1="abbaac";
        System.out.println(Distinct(str));
        System.out.println(Distinct(str1));
    }
}
