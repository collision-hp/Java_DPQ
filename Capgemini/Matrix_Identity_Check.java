// 12. Matrix Identity Check:
// Problem: Write a program to check if two given matrices are identical.

// Input:
// Matrix A: [[1,1,1,1], [2,2,2,2], [3,3,3,3], [4,4,4,4]]
// Matrix B: [[1,1,1,1], [2,2,2,2], [3,3,3,3], [4,4,4,4]]

// Output:
// Matrices are identical

// Explanation: The program checks each corresponding element in both matrices for equality.

public class Matrix_Identity_Check {
    public static boolean matrix_identical(int arr1[][], int arr2[][]){
        for(int i=0;i<arr1[0].length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[i][j]!=arr2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr1[][]={{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        int arr2[][]={{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        System.out.println(matrix_identical(arr1, arr2));

    }
}
