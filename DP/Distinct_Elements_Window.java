// Count Distinct Elements In Every Window of Size K

// Input: arr[] = [1, 2, 1, 3, 4, 2, 3], k = 4
// Output: [3, 4, 4, 3]
// Explanation: First window is [1, 2, 1, 3], count of distinct numbers is 3.
//              Second window is [2, 1, 3, 4] count of distinct numbers is 4.
//              Third window is [1, 3, 4, 2] count of distinct numbers is 4.
//              Fourth window is [3, 4, 2, 3] count of distinct numbers is 3.

import java.util.*;

public class Distinct_Elements_Window {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,4,2,3};
        int k=4;
        
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length-k+1;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(arr[j]);
            }
            int len=set.size();
            list.add(len);
        }
        System.out.println(list);
    }
}
