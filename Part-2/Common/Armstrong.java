package Common;

public class Armstrong {
    public static int armstrong(int n){
        int len=Integer.toString(n).length();
        int m=n;
        double sum=0;

        while(n>0){
            int x=n%10;
            sum+=Math.pow(x, len);
            n/=10;
        }
        if(m==sum){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(armstrong(87));
        System.out.println(armstrong(370));
        System.out.println(armstrong(153));
    }
}
