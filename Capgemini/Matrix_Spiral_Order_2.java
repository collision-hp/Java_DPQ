// Problem Statement –

// Write the code to traverse a matrix in a spiral format.
// Sample Input 
// Input -
// 5   4

// 1   2   3   4
// 5   6   7   8
// 9   10  11  12
// 13  14  15  16
// 17  18  19  20

// Output 
// 1  2  3  4  8  12  16  20  19  18  17  13  9  5  6  7  11  15  12  14 10  

public class Matrix_Spiral_Order_2 {
    public static void Spiral(int arr[][]) {
        int top = 0, left = 0;
        int bottom = arr.length - 1;
        int right = arr[0].length - 1;
        while (top <= bottom && left <= right) {
            // left to right
            for (int i = left; i <= right; i++) {
                System.out.println(arr[top][i]);
            }
            top++;
            // top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.println(arr[i][right]);
            }
            right--;
            // right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.println(arr[bottom][i]);
                }
                bottom--;
            }
            //bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.println(arr[i][left]);
                }
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,  2,  3,  4},
                        {5,  6,  7,  8},
                        {9,  10, 11, 12},
                        {13, 14, 15, 16},
                        {17, 18, 19, 20}
                    };
        Spiral(arr);
    }
}
