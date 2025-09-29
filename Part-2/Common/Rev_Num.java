package Common;
public class Rev_Num {
    public static int reverse(int n){
        int m=0;
        while(n>0){
            int x=n%10;
            n=n/10;
            m=x+m*10;
        }
        return m;
    }
    public static String reverseString(int n){
        String str=Integer.toString(n);
        String strnew="";
        for(int i=str.length()-1;i>=0;i--){
            strnew+=str.charAt(i);
        }
        return strnew;
    }
    public static void main(String[] args) {
        System.out.println(reverse(345));
        System.out.println(reverseString(345));
    }
}
