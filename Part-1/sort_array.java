// 35. write a program to sort array like 
// input :-  int array [] = {1,2,3,4,5,6,7,8,9,10} 
//           output:- 1, 10, 2, 9, 3, 8, 4, 7, 5, 6

public class sort_array {
    public static int [] sortArray(int arrorigin[],int n){
        int i=0,j=n-1,x=0;
        int arr[]=new int[n];
        while(i<=n/2 && j>=n/2 && x<n){
            arr[x++]=arrorigin[i++];
            arr[x++]=arrorigin[j--];
        }
        return arr;
    }

    public static void main(String[] args) {
        int n=10;
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        int newarr[]=sortArray(arr, n);
        for(int i:newarr){
            System.out.print(i+" ");
        }
    }
}
