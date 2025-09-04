package Common;
// Java program to find Prime number 
public class isPrime {
    public static void Prime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }
    public static void main(String[] args) {
        Prime(13);
    }
}
