// 21. Merge Two Sorted Arrays:
// Problem: Merge two sorted arrays into a

// Input:
// Array 1: [1, 3, 5]
// Array 2: [2, 4, 6]

// Output:
// [1,2,3,4,5,6]
import java.util.*;
public class Merge_Two_Arrays {
    public static int [] merging(int [] arr1,int arr2[]){
        int arrfinal[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arrfinal[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arrfinal[arr1.length+i]=arr2[i];
        }
        Arrays.sort(arrfinal);
        return arrfinal;
    }
    public static void main(String[] args) {
        int arr1[]={1,3,5};
        int arr2[]={2,4,6};
        for(int i:merging(arr1, arr2)){
            System.out.println(i);
        }
    }
}

