package Arrays;

public class sorting {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sortin(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            swap(arr, i, smallest);
        }
    }
    public static void printarr(int arr[]){
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};
        sortin(arr);
        printarr(arr);
    }
}
