// Write a program to print a diamond pattern with spaces in between
// Example for n = 4:
//    *
//   * *
//  * * *
// * * * *
//  * * *
//   * *
//    *

package Diamond_Patterns;

public class Diamond_4 {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            for(int k=4-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<4;i++){
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=4-i;k>0;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
