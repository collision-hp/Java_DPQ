// Problem - Maximum Sum of a Subarray with K Elements
// Input  : arr[] = [5, 2, -1, 0, 3], k = 3
// Output : 6
// Explanation : We get maximum sum by considering the subarray [5, 2 , -1]
public class Sliding_Window_Technique {
    public static void main(String[] args) {
        int arr[]={5,2,-1,0,3};
        int k=3;
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
}
