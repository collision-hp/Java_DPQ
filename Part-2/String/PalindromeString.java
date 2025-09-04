package String;
public class PalindromeString {
    public static String palindrome(String str){
        int i=str.length()-1;
        String newstr="";
        while(i>=0){
            newstr+=str.charAt(i);
            i--;
        }
        return newstr;
    }
    public static void main(String[] args) {
        System.out.println(palindrome("racecar"));
    }
}
