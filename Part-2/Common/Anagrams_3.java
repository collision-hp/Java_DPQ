package Common;
// Java program to determine if Two Strings areAnagrams 

import java.util.Arrays;

public class Anagrams_3 {
    public static void anagrams(String str1,String str2){
        str1=str1.replace(" ","").toLowerCase();
        str2=str2.replace(" ","").toLowerCase();

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
    public static void main(String[] args) {
        anagrams("listen","silent");
    }
}
