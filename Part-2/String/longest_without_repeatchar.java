package String;

// Java program to find the longest without repeating characters
import java.util.*;

public class longest_without_repeatchar {
    public static int distinct(String str) {
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        int length = set.size();
        return length;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb"; 
        String s3 = "pwwkew"; 
        String s4 = "";
        System.out.println(distinct(s1));
        System.out.println(distinct(s2));
        System.out.println(distinct(s3));
        System.out.println(distinct(s4));
    }
}
