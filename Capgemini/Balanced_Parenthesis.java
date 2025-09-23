// 23. Check for Balanced Parentheses:

// Problem: Given a string containing just the characters and ], determine if the input string is valid.

// Input:

// String: "{[()]}"

// Output:True

// Explanation: The string has balanced parentheses.

public class Balanced_Parenthesis {
    public static boolean parenthesis(String str){
        if(str.length()%2!=0){
            return false;
        }
        return true;
    }
    public static boolean parenthesisHashMap(String str){
        String str1="{[(";
        String str2=")]}";
        boolean  flag=false;
        for(int i=0;i<str.length()/2;i++){
            flag=false;
            for(int j=0;j<str1.length();j++){
                if(str.charAt(i)==str1.charAt(j)){
                    if(str.charAt(str.length()-1)==str2.charAt(str2.length()-1)){
                        flag=true;
                    }
                }
            }   
            if(flag==false){
                break;
            }
        }
        return flag;

    }
    public static void main(String[] args) {
        System.out.println(parenthesisHashMap("{[)]}"));
    }
    
}
