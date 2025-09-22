// Operate the String

// You are given a string. Your task is to determine how many letters in the string violate the condition.

// Condition:
// Every character in the string must appear at least twice.
// So, if a character appears only once, it violates the condition.

// Input Format:
// A single string (lowercase letters).

// Output Format
// Print the number of letters that violate the condition (i.e., appear only once).

// Input:
// ababcdeedca
// Output:
// 0

// Step-by-step Explanation:

// Frequency of characters:
// a → 3
// b → 2
// c → 2
// d → 2
// e → 2
// All characters appear at least twice, so none violate the condition.


// Example 2

// Input:
// factorius
// Output:
// 9
// Step-by-step Explanation

// Frequency of characters:
// f → 1
// a → 1
// c → 1
// t → 1
// o → 1
// r → 1
// i → 1
// u → 1
// s → 1

// All 9 characters appear only once, so all violate the condition.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Char_Frequency_Violation {
    public static int Violation(String str){
        int count=0;
        int violate=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            count=0;
            if(set.contains(str.charAt(i))){
                continue;
            }
            for(int j=i;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            set.add(str.charAt(i));
            if(count<2){
                violate++;
            }
        }
        return violate;
    }
    
    public static int ViolationHashMapTechnique(String str){
        int violate=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(int i:map.values()){
            if(i<2){
                violate++;
            }
        }
        return violate;
        
    }
    public static void main(String[] args) {
        String str1="factorius";
        String str2="ababcdeedca";
        System.out.println(Violation(str1));
        System.out.println(ViolationHashMapTechnique(str1));
        System.out.println(Violation(str2));
        System.out.println(ViolationHashMapTechnique(str2));
    }
}
