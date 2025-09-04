package String;
// 15.) Java program to gives Output: a2b2c3d2 
// for the Input String Str = “aabbcccdd”

import java.util.ArrayList;
import java.util.List;

public class charCountOp {
    public static String output(String str){
        List<Character> charlist=new ArrayList<>();
        String newstr="";
        for(int i=0;i<str.length();i++){
            if(charlist.contains(str.charAt(i))){
                continue;
            }
            int count=0;
            newstr+=str.charAt(i);
            for(int j=i;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            charlist.add(str.charAt(i));
            newstr+=count;
        }
        return newstr;
    }
    public static void main(String[] args) {
        System.out.println(output("aabbccdd"));
    }
}
