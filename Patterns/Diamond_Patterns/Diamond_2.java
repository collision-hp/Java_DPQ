// Write a program to print a diamond pattern with numbers
// Example for n = 4:
//    1
//   121
//  12321
// 1234321
//  12321
//   121
//    1

package Diamond_Patterns;
public class Diamond_2 {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            int n=0;
            for(int j=4-i;j>0;j--){
                System.out.print(" ");
            }
            int mid=(2*i-1)/2;
            for(int k=2*i-1;k>0;k--){
                if(k>mid){
                    n++;
                    System.out.print(n);
                }
                else{
                    n--;
                    System.out.print(n);
                }
            }
            System.out.println();
        }
        for(int i=1;i<4;i++){
            int n=0;
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }
            int mid=(7-2*i)/2;
            for(int k=7-2*i;k>0;k--){
                if(k>mid){
                    n++;
                    System.out.print(n);
                }
                else{
                    n--;
                    System.out.print(n);
                }
            }
            System.out.println();
        }
    }
}
