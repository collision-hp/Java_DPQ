// Write a program to print a diamond pattern with alphabets
// Example for n = 3:
//   A
//  ABA
// ABCBA
//  ABA
//   A

package Diamond_Patterns;
public class Diamond_3 {
    public static void main(String[] args) {
        for(int i=1;i<4;i++){
            int ch = 64;
            for(int k=3-i;k>0;k--){
                System.out.print(" ");
            }
            int mid=(2*i-1)/2;
            for(int j=2*i-1;j>0;j--){
                if(j>mid){
                    ch++;
                    System.out.print((char)(ch));
                }
                else{
                    ch--;
                    System.out.print((char)(ch));
                }
            }
            System.out.println();
        }
        for(int i=1;i<3;i++){
            int ch=64;
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }
            int mid=(5-2*i)/2;
            for(int k=5-2*i;k>0;k--){
                if(k>mid){
                    ch++;
                    System.out.print((char)(ch));
                }
                else{
                    ch--;
                    System.out.println((char)(ch));
                }
            }
        }
    }
}
