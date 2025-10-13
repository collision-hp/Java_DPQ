// 18. Longest Substring Without Repeating Characters:
// Problem: Given a string, find the length of the longest substring without repeating characters.

// Input:
// String: "abcabcbb"

// Output:
// 3

// Explanation: The longest substring is "abc", which has a length of 3.

import java.util.*;

public class Longest_Substr_Without_Repetition {
    public static String longestSubstr(String str){
        Set<Character> set=new HashSet<>();
        for(char ch:str.toCharArray()){
            set.add(ch);
        }
        String finalstr=str;
        for(int i=0;i<str.length();i++){
            Set<Character> setnew=new HashSet<>();
            setnew.add(str.charAt(i));
            for(int j=i+1;j<str.length();j++){
                setnew.add(str.charAt(j));
                if(setnew.size()==set.size()){
                    String substr=str.substring(i, j+1);
                    if(substr.length()<finalstr.length()){
                        finalstr=substr;
                    }
                }
            }
        }
        return finalstr;
    }
    public static String longestSubstr_M2(String str){
        String substr="";
        Set<Character> set = new HashSet<>();
        for(char ch:str.toCharArray()){
            set.add(ch);
        }
        int len=set.size();
        Set<Character> setnew=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            setnew.clear();
            setnew.add(str.charAt(i));
            for(int j=i+1;j<str.length();j++){
                if(setnew.contains(str.charAt(j))){
                    break;
                }
                setnew.add(str.charAt(j));
                if(setnew.size()==len){
                    for(char ch:setnew){
                        substr+=ch;
                    }
                    return substr;
                }
            }
        }
        return "Not found";
    }
    public static void main(String[] args) {
        System.out.println(longestSubstr("abcabdcbb"));
        System.out.println(longestSubstr_M2("abcabdcbb"));
    }
}
