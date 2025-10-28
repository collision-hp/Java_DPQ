package String;
// Java program to find the longest without repeating characters
import java.util.*;

public class longest_without_repeatchar {
    public static String DistinctStr(String str){
        Set<Character> set=new HashSet<>();
        String maxstr="";
        for(int i=0;i<str.length();i++){
            String substr="";
            substr+=str.charAt(i);
            set.add(str.charAt(i));
            for(int j=i+1;j<str.length();j++){
                if(set.contains(str.charAt(j))){
                    break;
                }
                set.add(str.charAt(j));
                substr+=str.charAt(j);
            }
            if(substr.length()>maxstr.length()){
                maxstr=substr;
            }
            set.clear();
        }
        return maxstr;
    }

    public static void main(String[] args) {
        String s1 = "abdcabcbb";
        String s2 = "bbbbb"; 
        String s3 = "pwwkew"; 
        String s4 = "";
        System.out.println(DistinctStr(s1));
        System.out.println(DistinctStr(s2));
        System.out.println(DistinctStr(s3));
        System.out.println(DistinctStr(s4));
    }
}
















// Set<Character> set = new HashSet<>();
//         for (char ch : str.toCharArray()) {
//             set.add(ch);
//         }
//         int length = set.size();
//         return length;
