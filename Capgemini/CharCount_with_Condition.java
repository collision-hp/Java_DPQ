// Character Count with Minimum

// Problem: Count the occurrences of each character in the string. If the occurrence of a character is less than 2, treat it as having occurred 2 times instead. Calculate the total number of occurrences and print the result.

// Input: "balloon"

// Output: 10

import java.util.HashSet;
import java.util.Set;

public class CharCount_with_Condition {
    public static int CharCount(String str){
        int count=0;
        int output=0;
        String strmultiple="";
        String strsingle="";
        Set<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            count=0;
            if(set.contains(str.charAt(i))){
                strmultiple+=str.charAt(i);
                continue;
            }
            for(int j=i;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            set.add(str.charAt(i));
            if(count<2){
                strsingle+=str.charAt(i);
            }
            else{
                strmultiple+=str.charAt(i);
            }
        }
        output+=strmultiple.length();
        output+=(strsingle.length())*2;
        return output;
    }
    public static void main(String[] args) {
        System.out.println(CharCount("balloon"));
    }
}
