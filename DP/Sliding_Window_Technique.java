// Problem - Maximum Sum of a Subarray with K Elements
// Input  : arr[] = [5, 2, -1, 0, 3], k = 3
// Output : 6
// Explanation : We get maximum sum by considering the subarray [5, 2 , -1]
import java.util.*;
public class Sliding_Window_Technique {
    public static void Method_1(int arr[],int k){
        List<Integer> list=new ArrayList<>();
        int sum=0;
        int indx=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            list.add(arr[i]);
            if(list.size()==k){
                if(max<sum){
                    max=sum;
                    indx=i-k+1;
                }
                list.clear();
                sum=0;
            }
        }
        System.out.println(max);

        for(int i=indx;i<indx+3;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void Method_2(int arr[],int k){
        int max=arr[0];
        for(int i=0;i<arr.length-k+1;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            max=Math.max(max, sum);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]={5,2,-1,0,3};
        int k=3;
        Method_1(arr, k);
        Method_2(arr, k);
    }
}
