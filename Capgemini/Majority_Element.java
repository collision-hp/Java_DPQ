// 28. Find the Majority Element:

// Problem: Given an array of size n, find the majority element (appears more than n/2 times).

// Input:
// Array: [2, 2, 1, 1, 1, 2, 2]

// Output: 2
// Explanation: The number 2 appears more than n/2 times.

import java.util.*;

public class Majority_Element{
    public static void Appearance(int arr[]){
        int n=arr.length/2;
        int count=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            count=0;
            if(set.contains(arr[i])){
                continue;
            }
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            set.add(arr[i]);
            if(count>n){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2, 2, 1, 1, 1, 2, 2};
        Appearance(arr);
    }
}
