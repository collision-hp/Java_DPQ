
public class Armstrong {
    public static int armstrong(int n){
        int len=Integer.toString(n).length();
        double num=0;
        while(n>0){
            int x=n%10;
            num+=Math.pow(x, len);
            n/=10;
        }
        if(n==num){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(armstrong(87));
    }
}
