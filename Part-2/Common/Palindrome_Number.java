package Common;
public class Palindrome_Number {
    public static void palindrome(int n){
        int newnum=0;
        int original=n;
        while(n>0){
            int rem=n%10;
            n/=10;
            newnum=rem+newnum*10;
        }
        if(original==newnum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        palindrome(101);
    }
}
