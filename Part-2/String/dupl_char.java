package String;
// Java program to find duplicate characters in a string
// Duplicate Characters in : Learn Java Programming 
// a : 4 ,g : 2 ,m : 2 ,n : 2 ,r : 3
import java.util.*;
public class dupl_char {
    public static void dupl_char_count(String str){
        char arr[]=str.toCharArray();
        HashMap <Character,Integer> charcount=new HashMap<>();
        for(char i:arr){
            if(i==' ') continue;
            if(charcount.containsKey(i)){
                charcount.put(i,charcount.get(i)+1);
            }
            else{
                charcount.put(i,1);
            }
        }
        for(char ch:charcount.keySet()){
            if(charcount.get(ch)>1){
                System.out.println(ch+" :"+charcount.get(ch));
            }
        }
    }
    public static void main(String[] args) {
        dupl_char_count("Learn Java Programming");
    }
}
