// Find gcd of 2 numbers using euclidean algorithm

public class Find_GCD_using_Euclidean_Algorithm {
    public static int gcd(int a,int b){    //2,5

        while(b!=0){                           //5 , 2
            int temp=b;                        //temp=5 , 2 , 3 , 2 , 1 , 1
            b=a%b;                             //b=2 , 3 , 2 , 1 , 1 , 0
            a=temp;                            //a=5 , 2 , 3 , 2 , 1 , 1
        }
        return a;
    }

    public static int gcdMethod_2(int a,int b){
        int max=Math.max(a, b);
        int lcm=max;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                return lcm;
            }
            lcm++;
        }
    }
    public static void main(String[] args) {
        System.out.println(gcd(2, 5));
        System.out.println(gcdMethod_2(2, 6));
    }
}
