// banana chat  ->  aaabnn  acht
// using arrays.sort concept

import java.util.*;
public class Sorted_All_SubString {
    public static String sort(String str) {
        String finalstr = "";

        String substr="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' '){
                substr+=str.charAt(i);
            }
            if (i == str.length()-1 || str.charAt(i) == ' ') {
                char [] arr=substr.toCharArray();
                Arrays.sort(arr);
                String sortedsubstr="";
                for(char ch:arr){
                    sortedsubstr+=ch;
                }
                finalstr+=sortedsubstr+" ";
                substr="";
            }
        }
        return finalstr;
    }

    public static void main(String[] args) {
        System.out.println(sort("banana chat"));  // output: aaabnn acht
    }
}
