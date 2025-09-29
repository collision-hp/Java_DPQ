package Common;
// Write a program to Whether Given String is 
// palindrome String or not? 
//  Ex: madam 
//  Output: Given String is Palindrome
public class Palindrome_String {
    public static void Palindrome(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=rev.charAt(i)){
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
    public static void main(String[] args) {
        Palindrome("racecar");
    }
}
