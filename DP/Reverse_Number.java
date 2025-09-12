//Reverse a number without using the 2nd variable

public class Reverse_Number {
    public static void main(String[] args) {
        int n=1234;
        while(n!=0){
            int rem=n%10;
            System.out.print(rem);
            n/=10;
        }
    }
}
