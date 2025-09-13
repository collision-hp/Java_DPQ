public class Pattern8 {
    public static void main(String[] args) {
        for(int i=1;i<7;i++){
            int n=i+1;
            for(int j=6-i;j>0;j--){
                System.out.print(" ");
            }
            int x=2*i-1;
            int mid=x/2;
            for(int j=x;j>0;j--){
                if(j>mid){
                    --n;
                    System.out.print(n);
                }
                else{
                    ++n;
                    System.out.print(n);
                }
            }
            System.out.println();
        }
    }
}
