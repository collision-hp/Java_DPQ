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
        String finalstr=str;
        String substr="";
        Set<Character> set=new HashSet<>();
        for(char ch:str.toCharArray()){
            set.add(ch);
        }
        Set<Character> newset=new HashSet<>();
        for(int i=0;i<str.length();i++){
            newset.clear();
            substr="";
            for(int j=i;j<str.length();j++){
                newset.add(str.charAt(j));
                if(set.size()==newset.size()){
                    substr=str.substring(i, j+1);
                    if(substr.length()<finalstr.length()){
                        finalstr=substr;
                    }
                }
            }
        }
        return finalstr;
    }
    
    public static void main(String[] args) {
        System.out.println(longestSubstr("abbcabdcbb"));
    }
}
