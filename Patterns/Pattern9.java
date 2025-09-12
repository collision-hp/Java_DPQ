public class Pattern9 {
    public static void main(String[] args) {
        char ch='*';
        for(int i=1;i<=6;i++){
            for(int j=6-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                System.out.print(ch);
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int j=6-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
