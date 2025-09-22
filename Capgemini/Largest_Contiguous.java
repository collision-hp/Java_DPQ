// 24. Largest Sum Contiguous Subarray (Kadane's Algorithm):

// Problem: Find the maximum sum of a contiguous subarray.

// Input:
// Array: [-2, 1, -3, 4, -1, 2, 1, -5, 4]

// Output:
// 6
// Explanation: The subarray [4, -1, 2, 1] has the largest sum = 6.

import java.util.*;

public class Largest_Contiguous {
    public static int Maximum(int arr[]){
        int currentsum=arr[0];
        int maxsum=arr[0];

        for(int i=1;i<arr.length;i++){
            currentsum=Math.max(arr[i], currentsum+arr[i]);
            maxsum=Math.max(maxsum, currentsum);
        }
        return maxsum;
    }
    public static void MaximumListMethod(int arr[]){
        int sum=0;
        int max=arr[0];
        int maxFinal=arr[0];
        int x=0;
        int y=0;
        List<Integer> listfinal=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            sum=0;
            sum+=arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                if(sum>max){
                    max=sum;
                    y=j;
                }
            }
            if(max>maxFinal){
                x=i;
                maxFinal=max;
            }
        }
        for(int i=x;i<y+1;i++){
            listfinal.add(arr[i]);
        }
        System.out.println(listfinal);
        System.out.println(maxFinal);
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        MaximumListMethod(arr);
        System.out.println(Maximum(arr));
    }
}
