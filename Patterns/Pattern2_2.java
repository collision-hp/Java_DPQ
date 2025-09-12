//print z pattern

public class Pattern2_2 {
    public static void main(String[] args) {
        char ch = '*';
        int n=5;
        for (int i = 1; i < 6; i++){
            for(int j=1;j<6;j++){
                if(i==1 || i==n || j+i==6){
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
