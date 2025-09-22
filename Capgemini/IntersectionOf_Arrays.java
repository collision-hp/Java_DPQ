// 25. Find the Intersection of Two Arrays:

// Problem: Find the intersection of two unsorted arrays.

// Input:
// Array 1: [1, 2, 2, 1]
// Array 2: [2, 2]

// Output: 2
// Explanation: The common element between the arrays is 2.

import java.util.HashSet;
import java.util.Set;

public class IntersectionOf_Arrays {
    public static void Intersection(int arr1[],int arr2[]){
        Set<Integer> set=new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        Set<Integer> comm=new HashSet<>();
        for(int i=0;i<arr2.length;i++){
            if(comm.contains(arr2[i])){
                continue;
            }
            if(set.contains(arr2[i])){
                System.out.println(arr2[i]);
            }
            comm.add(arr2[i]);
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,2,2,1};
        int arr2[]={2,2};
        Intersection(arr1,arr2);
    }
}
