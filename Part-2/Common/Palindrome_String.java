package Common;
// Write a program to Whether Given String is 
// palindrome String or not? 
//  Ex: madam 
//  Output: Given String is Palindrome
public class Palindrome_String {
    public static void Palindrome(String str){
        String rev="";
        for(int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;
        }
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        Palindrome("racecar");
    }
}
