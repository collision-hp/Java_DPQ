//WAP to count the number of occurences of each characters in the string

import java.util.HashMap;
import java.util.Map;

public class No_Occur {
    public static void no_occur(String str){
        str=str.replace(" ","");
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        String str="King Kohli";
        no_occur(str);
    }
}
