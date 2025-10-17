import java.util.*;

public class Unique_Alphabets {
    public static String Unique(String str){
        Set<Character> set=new LinkedHashSet<>();
        String str2="";
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for(char ch:set){
            str2+=ch;
        }
        return str2;
    }
    public static void main(String[] args) {
        System.out.println(Unique("Missisippi"));
    }
}
