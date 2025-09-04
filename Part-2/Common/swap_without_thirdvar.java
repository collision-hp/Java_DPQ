package Common;
public class swap_without_thirdvar {
    public static void main(String[] args) {
        int a=9,b=7;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a:"+a+"\n"+"b:"+b);
    }
}
