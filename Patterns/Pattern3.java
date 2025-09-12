public class Pattern3 {
    public static void main(String[] args) {
        int n=1;
        for(int i=1;i<7;i++){
            for(int j=6-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(n+" ");
            }
            n++;
            System.out.println();
        }
    }
}
