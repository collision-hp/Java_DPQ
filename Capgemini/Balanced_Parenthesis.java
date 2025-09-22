// 23. Check for Balanced Parentheses:

// Problem: Given a string containing just the characters and ], determine if the input string is valid.

// Input:

// String: "{[()]}"

// Output:True

// Explanation: The string has balanced parentheses.

import java.util.*;
public class Balanced_Parenthesis {
    public static boolean parenthesis(String str){
        if(str.length()%2!=0){
            return false;
        }
        return true;
    }
    public static void parenthesisHashMap(String str){
        Map<Character,Character> map=new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        for(int i=0;i<str.length()/2;i++){
            if(map.containsKey(str.charAt(i))){
                if(map.get(str.charAt(i))!=str.charAt(str.length()-1-i)){
                    System.out.println("Not balanced");
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(parenthesis("{[()]}"));
        parenthesisHashMap("{[()]}");
    }
    
}
