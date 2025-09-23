// 27. Matrix Rotation by 90 Degrees:

// Problem: Rotate a 2D matrix by 90 degrees clockwise.

// Input:Matrix: [[1, 2, 3],
//               [4, 5, 6],
//               [7, 8, 9]]

// Output:
// [[7, 4, 1],
// [8, 5, 2], 
// [9, 6, 3]]

// Explanation: The matrix is rotated 90 degrees clockwise.
public class Matrix_Rotation_by90 {
    public static int[][] Rotation(int arr[][]){
        //transpose
        for(int i=0;i<3;i++){
            for(int j=i;j<3;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        int right=arr[0].length-1;
        for(int i=0;i<arr.length;i++){
            int temp=arr[i][0];
            arr[i][0]=arr[i][right];
            arr[i][right]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arrnew[][]=Rotation(arr);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arrnew[i][j]);
            }
            System.out.println();
        }
    }
}
