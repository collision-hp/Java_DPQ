//134
//798
//add the 2 numbers
//carry -> 2

public class Count_Carries {
    public static int Carry(int n,int m){
        int totalcarry=0;
        int carry=0;
        while(n!=0 && m!=0){
            int x=n%10;
            int y=m%10;
            int sum=x+y+carry;
            if(sum>9){
                carry=1;
                totalcarry+=carry;
            }
            else{
                carry=0;
            }
            n/=10;
            m/=10;
        }
        return totalcarry;
    }
    public static void main(String[] args) {
        System.out.println(Carry(134, 798));
    }
}
