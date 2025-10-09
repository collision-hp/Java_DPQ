package String;
import java.util.*;
import java.util.Set;

public class UniqueChars{
    public static String unique(String str){
        // str=str.replace(" ", "");
        Set <Character> charset=new LinkedHashSet<>();
        // charset.add(str.charAt(0));
        StringBuilder strnew=new StringBuilder();
        for(char i:str.toCharArray()){
            charset.add(i);
            // if(charset.contains(i)){
            //     continue;
            // }
            // else{
            //     strnew.append(i);
            //     charset.add(i);
            // }
        }
        for(char i:charset){
            System.out.print(i);
        }
        return strnew.toString();
    }
    public static void main(String[] args) {
        // System.out.println(unique("Java Automation"));
        unique("Java Automation");
    }
}