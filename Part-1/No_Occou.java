//WAP to count the number of occurences of each characters in the string

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class No_Occou {
    public static void no_occur(String str){
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
        Scanner ni=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=ni.nextLine();
        no_occur(str);
    }
}
