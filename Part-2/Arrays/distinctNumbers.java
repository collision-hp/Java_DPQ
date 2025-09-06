// Java program – input array was 
// given [ 1,1,2,2,3,4,5,5,6,6],
// Output – [3,4]

package Arrays;

import java.util.*;

public class distinctNumbers {
    public static void distinct(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]+1)!=arr[i+1]){
                i++;
            }
            else{
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,5,5,6,6};
        distinct(arr);
    }
}
