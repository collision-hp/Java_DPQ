// Print the number of subarrays of having negative sums.
// Input
// 1 -2 4 -5 1
// Output
// 9

package HackerRank;
public class Negative_Sum {
    public static int SubArray(int arr[]){
        int res=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum<0){
                    res++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,4,-5,1};
        System.out.println(SubArray(arr));
    }
}
