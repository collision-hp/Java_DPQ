// 24. Largest Sum Contiguous Subarray (Kadane's Algorithm):

// Problem: Find the maximum sum of a contiguous subarray.

// Input:
// Array: [-2, 1, -3, 4, -1, 2, 1, -5, 4]

// Output:
// 6
// Explanation: The subarray [4, -1, 2, 1] has the largest sum = 6.

public class Largest_Contiguous {
    public static int MaxM_1(int arr[]){
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
    public static int Maximum(int arr[]){
        int currentsum=arr[0];
        int maxsum=arr[0];

        for(int i=1;i<arr.length;i++){
            currentsum=Math.max(arr[i], currentsum+arr[i]);
            maxsum=Math.max(maxsum, currentsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxM_1(arr));
        System.out.println(Maximum(arr));
    }
}
