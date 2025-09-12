//print z pattern

public class Pattern10 {
    public static void main(String[] args) {
        char ch = '*';
        for(int i=1;i<6;i++){
            if(i==1 || i==5){
                for(int j=5;j>0;j--){
                    System.out.print(ch);
                }
                System.out.println();
            }
            else{
                for(int j=5-i;j>0;j--){
                    System.out.print(" ");
                }
                System.out.print(ch);
                System.out.println();
            }
        }

        
        //OR


        for(int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                if(i==1 || i==5 || (i+j)==6){
                    System.out.print(ch);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
