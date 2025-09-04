package String;
import java.util.HashSet;
import java.util.Set;

public class UniqueChars{
    public static String unique(String str){
        str=str.replace(" ", "");
        Set <Character> charset=new HashSet<>();
        // charset.add(str.charAt(0));
        StringBuilder strnew=new StringBuilder();
        for(char i:str.toCharArray()){
            if(charset.contains(i)){
                continue;
            }
            else{
                strnew.append(i);
                charset.add(i);
            }
        }
        return strnew.toString();
    }
    public static void main(String[] args) {
        
        System.out.println(unique("Java Automation"));
    }
}