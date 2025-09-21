public class find_LCM {
    public static int LCM(int a,int b,int c){
        int max=Math.max(a,Math.max(c, b));
        int lcm=max;
        while(true){
            if(lcm%a==0 && lcm%b==0 && lcm%c==0){
                return lcm;
            }
            lcm++;
        }
    }
    public static void main(String[] args) {
        System.out.println(LCM(2, 3, 4));
        System.out.println(LCM(4, 5, 6));
    }
}
