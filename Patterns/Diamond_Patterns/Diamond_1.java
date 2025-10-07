// Write a program to print a diamond pattern of stars for a given number of rows
// Example for n = 5:
//   *
//  ***
// *****
//  ***
//   *

package Diamond_Patterns;
public class Diamond_1 {
    public static void main(String[] args) {
        for(int i=1;i<4;i++){
            for(int k=3-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<3;i++){
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=5-2*i;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
