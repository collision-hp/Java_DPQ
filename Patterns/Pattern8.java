public class Pattern8 {
    public static void main(String[] args) {
        // int n=1;
        for(int i=1;i<=6;i++){
            for(int j=6-i;j>=1;j--){
                System.out.print("  ");
            }
            //decreasing number printing
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            //increasing number printing
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            // for(int j=2*i-1;j>=1;j--){
            //     System.out.print(n+" ");
            // }
            // n++;
            System.out.println();
        }
    }
}
