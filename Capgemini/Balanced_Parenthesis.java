// 23. Check for Balanced Parentheses:
// Problem: Given a string containing just the characters and ], determine if the input string is valid.
// Input:
// String: "{[()]}"
// Output:True
import java.util.*;
public class Balanced_Parenthesis {
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
        System.out.println(ParenthesisPointer("[{()}]"));
    }
}
