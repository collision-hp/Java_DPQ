// banana chat  ->  abn acht 
//using set tree concept
import java.util.*;

public class Sorted_Distinct_SubString {
    public static void sort(String str){
        Set<Character> set=new TreeSet<>();
        String finalstr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                set.add(str.charAt(i));
            }
            if(str.charAt(i)==' ' || i==str.length()-1){
                String strnew="";
                for(char ele:set){
                    strnew+=ele;
                }
                finalstr+=strnew+" ";

                set.clear();
            }
        }
        System.out.println(finalstr);
    }
    public static void main(String[] args) {
        sort("banana chat");
    }
}
