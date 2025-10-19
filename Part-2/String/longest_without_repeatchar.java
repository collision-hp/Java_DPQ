package String;
// Java program to find the longest without repeating characters
import java.util.*;

public class longest_without_repeatchar {
    public static String distinct(String str) {
        int max=0;
        String strdist="";
        for(int i=0;i<str.length();i++){
            Set<Character> set=new HashSet<>();
            String finalstr="";
            for(int j=i;j<str.length();j++){
                if(set.contains(str.charAt(j))){
                    break;
                }
                finalstr+=str.charAt(j);
                set.add(str.charAt(j));
            }
            if(finalstr.length()>max){
                max=finalstr.length();
                strdist=finalstr;
            }
        }
        return strdist;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb"; 
        String s3 = "pwwkew"; 
        String s4 = "";
        System.out.println(distinct(s1));
        System.out.println(distinct(s2));
        System.out.println(distinct(s3));
        System.out.println(distinct(s4));
    }
}
















// Set<Character> set = new HashSet<>();
//         for (char ch : str.toCharArray()) {
//             set.add(ch);
//         }
//         int length = set.size();
//         return length;
