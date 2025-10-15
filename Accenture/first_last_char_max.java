// Find the Most Frequent First-Last Character Pair in a String
// Given a string containing multiple words, for each word extract the pair consisting of its first and last character. Among all these first-last character pairs, find the one that appears most frequently in the text.

import java.util.*;

public class first_last_char_max {
    public static Map<String,Integer> Repetition(String str){
        Map<String,Integer>map=new HashMap<>();
        String substr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                substr+=str.charAt(i);
            }
            if(str.charAt(i)==' ' || i==str.length()-1){
                char ch[]=substr.toCharArray();
                String flstr="";
                flstr+=ch[0];
                flstr+=ch[ch.length-1];
                map.put(flstr, map.getOrDefault(flstr, 0)+1);
                substr="";
            }
        }
        return map;
    }
    public static String RepetitionFinal(Map<String,Integer> mp){
        String str="";
        int max=0;
        for(String i:mp.keySet()){
            int x=mp.get(i);
            if(max<x){
                max=x;
                str=i;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String str="apple banana are my favourite fruit anywhere";
        System.out.println(Repetition(str));
        System.out.println(RepetitionFinal(Repetition(str)));
    }
}
