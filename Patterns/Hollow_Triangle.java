//      *
//     * *
//    *   *
//   *     *
//  *       *
// ***********

public class Hollow_Triangle {
    public static void main(String[] args) {
        for(int i=1;i<7;i++){
            for(int j=6-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=2*i-1;k>0;k--){
                if(k==2*i-1 || k==1){
                    System.out.print("*");
                }
                else if(i==6){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}