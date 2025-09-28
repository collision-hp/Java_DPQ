//WAP to count the number of occurences of each characters in the string

import java.util.HashMap;
import java.util.Map;

public class No_Occou {
    public static void no_occur(String str){
        str=str.replace(" ","");
        char diststr=' ';
        Map<Character,Integer> mp=new HashMap<>();

        int count=0;
        for(int i=0;i<str.length();i++){
            diststr=str.charAt(i);
            if(mp.containsKey(diststr)){
                continue;
            }
            for(int j=i;j<str.length();j++){
                if(diststr==str.charAt(j)){
                    count++;
                }
            }
            mp.put(diststr,count);
            count=0;
        }
        System.out.println(mp);
    }
    public static void main(String[] args) {
        String str="King Kohli";
        no_occur(str);
    }
}