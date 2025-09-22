public class Largest_Among_3 {
    public static void main(String[] args) {
        int x=2,y=5,z=9;
        int max=x;
        if(y>max){
            max=y;
            if(z>max){
                max=z;
            }
        }
        int maximum=Math.max(x,Math.max(y, z));
        System.out.println(maximum);
        System.out.println(max);
    }
}
