// Write a program to whether check given string 
// contains vowels or not? 
//  Ex: nacre123 
//  Output: Given String Contains vowels

public class vowels {
    public static String vowel_detecttion(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                return ("String contains vowel");
            }
        }
        return "String doesn't contain vowel";
    }
    public static void main(String[] args) {
        System.out.println(vowel_detecttion("Affidebit"));
    }
}
