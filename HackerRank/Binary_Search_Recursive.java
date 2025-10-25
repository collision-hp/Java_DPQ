package HackerRank;
public class Binary_Search_Recursive {
    public static void Recursive_Approach(int arr[],int n){
        if(n==1){
            return;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        Recursive_Approach(arr, n-1);
    }
    public static void main(String[] args) {
        int arr[]={4,5,2,23,1,8};
        Recursive_Approach(arr,arr.length);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
