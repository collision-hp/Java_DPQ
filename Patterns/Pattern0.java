public class Pattern0 {
    public static void main(String[] args) {
        char ch='*';
        for(int i=1;i<4;i++){
            for(int j=3-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        //or
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}



