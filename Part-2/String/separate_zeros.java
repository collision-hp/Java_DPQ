package String;
// 19.) 
// Java program to gives Output: 
// “32412120000” for the InputString Str = “32400121200” 
// Java program to gives Output: 
// “00003241212” for the InputString Str = “32400121200”

import java.util.*;

public class separate_zeros {
    public static List<String> zeros(String str){
        String strzeros="";
        String rest="";
        List<String> ll=new ArrayList<>();
        for(char i:str.toCharArray()){
            if(i=='0'){
                strzeros+=i;
            }
            else{
                rest+=i;
            }
        }
        ll.add(strzeros);
        ll.add(rest);
        return ll;

    }
    public static String initial_zeros(String str){
        List <String> parts=zeros(str);
        return parts.get(0)+parts.get(1);
    }
    public static String post_zeros(String str){
        List <String> parts=zeros(str);
        return parts.get(1)+parts.get(0);
    }
    public static void main(String[] args) {
        String str="32400121200";
        System.out.println(initial_zeros(str));
        System.out.println(post_zeros(str));
    }
}
