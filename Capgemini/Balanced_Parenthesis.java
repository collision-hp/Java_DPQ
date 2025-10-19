// 23. Check for Balanced Parentheses:
// Problem: Given a string containing just the characters and ], determine if the input string is valid.
// Input:
// String: "{[()]}"
// Output:True
import java.util.*;
public class Balanced_Parenthesis {
    public static boolean parenthesis(String str){
        if(str.length()%2!=0){
            return false;
        }
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
    

    public static boolean ParenthesisPointer(String str){
        if(str.length()%2!=0){
            return false;
        }
        Map<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        int i=0,j=str.length()-1;
        boolean flag=false;
        while(i<str.length()/2 && j>str.length()/2){
            if(map.containsKey(str.charAt(i)) && map.get(str.charAt(i))==str.charAt(j)){
                flag=true;
                i++;
                j--;
            }
            else{
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(parenthesis("{[()]}"));
        System.out.println(ParenthesisPointer("{[()]}"));
    }
}
