public class Pattern4 {    
    public static void main(String[] args) {
        for(int i=1;i<7;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


        //OR  

        
        for(int i=1;i<=6;i++){
            int n=1;
            for(int j=i;j>=1;j--){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}
