public class find_LCM {

    public static int LCM(int a,int b,int c){
        int lcm=Math.max(a,(Math.max(b, c)));
        while(lcm%a!=0 || lcm%b!=0 || lcm%c!=0){
            lcm++;
        }
        return lcm;
    }

    public static int LCM_M2(int a,int b,int c){
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
        System.out.println(LCM_M2(4, 5, 6));
    }
}
