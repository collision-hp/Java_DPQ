// Find gcd of 2 numbers using euclidean algorithm

public class Find_GCD_using_Euclidean_Algorithm {
    public static boolean gcd(int a,int b){    //2,5

        while(b!=0){                           //5 , 2
            int temp=b;                        //temp=5 , 2 , 3 , 2 , 1 , 1
            b=a%b;                             //b=2 , 3 , 2 , 1 , 1 , 0
            a=temp;                            //a=5 , 2 , 3 , 2 , 1 , 1
        }
        if(a==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(gcd(2, 5));
        System.out.println(gcd(2, 8));
    }
}
