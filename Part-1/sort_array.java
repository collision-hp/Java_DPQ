// 35. write a program to sort array like 
// input :-  int array [] = {1,2,3,4,5,6,7,8,9,10} 
//           output:- 1, 10, 2, 9, 3, 8, 4, 7, 5, 6

public class sort_array {
    public static int [] sortArray(int arr[],int n){
        int arr1[]=new int[n];
        int x=0,y=n-1;

        for(int i=0;i<n;i++){
            if((i+1)%2==0){
                arr1[i]=arr[y];
                y--;
            }
            else{
                arr1[i]=arr[x];
                x++;
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        int n=10;
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        int newarr[]=sortArray(arr, n);
        for(int i:newarr){
            System.out.println(i);
        }
        
    }
}
