// Numbers with gcd as 1 are called coprime.

public class CoPrime_Pairs {
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        if(a==1){
            return 1;
        }
        return 0;
    }
    public static void coprime(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(gcd(arr[i], arr[j])==1){
                    System.out.println(arr[i]+" , "+arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,7,12,8};
        coprime(arr);
    }
}
