// 30. Merge Intervals:
// Problem: Given a collection of intervals, merge all overlapping intervals.

// Input:
// Intervals: [[1,3], [2,6], [8, 10], [15, 18]]
//     {1, 3},
//     {2, 6},
//     {8, 10},
//     {15, 18}
// Output:
// [[1,6], [8, 10], [15, 18]]

// Explanation: Intervals [1,3] and [2,6] overlap, so they are merged into [1,6]. The others remain unchanged.

public class Merge_Interval {
    public static int [][] Merge(int arr[][],int n,int m){
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i+1][j]<arr[i][j+1]){

                }
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
