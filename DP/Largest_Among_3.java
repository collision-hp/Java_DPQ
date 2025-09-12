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
        System.out.println(max);
    }
}
