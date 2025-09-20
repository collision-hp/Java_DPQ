// String str="aabbbbeeeeffggg" -> a2b4e4f2g3

import java.util.*;

public class TotalNumber_Alpha {
    public static String alpha(String str){
        Set<Character> set=new HashSet<>();
        int count=0;
        String strfinal="";
        for(int i=0;i<str.length();i++){
            if(set.contains(str.charAt(i))){
                continue;
            }
            for(int j=i;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            strfinal+=str.charAt(i);
            strfinal+=count;
            set.add(str.charAt(i));
            count=0;
        }
        return strfinal;
    }
    public static String alphaMethod2(String str){
        int count=1;
        String strfinal="";
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                strfinal+=str.charAt(i-1);
                strfinal+=count;
                count=1;
            }
        }
        strfinal+=str.charAt(str.length()-1);
        strfinal+=count;
        return strfinal;
    }
   
    public static void main(String[] args) {
        String str="aabbbbeeeeffggg";
        System.out.println(alpha(str));
        System.out.println(alphaMethod2(str));
    }
}
