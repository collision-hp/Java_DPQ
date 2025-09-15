// Sum of min and max of all subarrays of size k.
// Input : arr[] = {2, 5, -1, 7, -3, -1, -2}  
//         K = 4
// Output : 18
// Explanation : Subarrays of size 4 are : 
//      {2, 5, -1, 7},   min + max = -1 + 7 = 6
//      {5, -1, 7, -3},  min + max = -3 + 7 = 4      
//      {-1, 7, -3, -1}, min + max = -3 + 7 = 4
//      {7, -3, -1, -2}, min + max = -3 + 7 = 4  

//           Sum of all min & max = 6 + 4 + 4 + 4 = 18

import java.util.ArrayList;
import java.util.List;

public class Sum_Sub_Array_maxmin {
    public static void main(String[] args) {
        int arr[]={2,5,-1,7,-3,-1,-2};
        int k=4;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length-k+1;i++){
            int max=arr[i],min=arr[i];
            for(int j=i;j<i+k;j++){
                max=Math.max(max, arr[j]);
                min=Math.min(min,arr[j]);
            }
            System.out.println(max+" "+min);
            list.add(max);
            list.add(min);
        }
        int sum=0;
        for(int i:list){
            sum+=i;
        }
        System.out.println(sum);
    }
}
