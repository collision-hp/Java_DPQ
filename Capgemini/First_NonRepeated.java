// 29. Find the First Non-Repeated Character in a String:
// Problem: Given a string, find the first character that does not repeat.
// Input:
// String: "swiss"
// Output: w
// Explanation: 'w' is the first character that does not repeat in the string.

import java.util.*;

public class First_NonRepeated {
    public static void Non_Repeated(String str){
        for(int i=0;i<str.length();i++){
            boolean flag=true;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(str.charAt(i));
                break;
            }

        }
    }
    
    public static Character Non_rep(String str){
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(char i:map.keySet()){
            if(map.get(i)==1){
                return i;
            }
        }
        return ' ';
    } 
    public static void main(String[] args) {
        Non_Repeated("swiss");
        System.out.println(Non_rep("swiss"));
    }
}
