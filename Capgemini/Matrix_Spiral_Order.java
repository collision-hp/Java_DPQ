// Write a Java program that takes a 2D matrix as input and prints its elements in spiral order (clockwise), starting from the top-left element.
// arr = {
//    {1, 2, 3},
//    {4, 5, 6},
//    {7, 8, 9}
// }
// Output:
// 1, 2, 3, 6, 9, 8, 7, 4, 5
public class Matrix_Spiral_Order {
    public static void Spiral_Order(int arr[][]){   
        int top=0,left=0;
        int bottom=arr.length-1;
        int right=arr[0].length-1; //first row length
        while(top<=bottom && left<=right){
            // Traverse left -> right
            for(int i=left;i<=right;i++){
                System.out.println(arr[top][i]);
            }
            top++;
            //Traverse top to bottom
            for(int i=top;i<=bottom;i++){
                System.out.println(arr[i][right]);
            }
            right--;
            //traverse right -> left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.println(arr[bottom][i]);
                }
                bottom--;
                //now top=bottom
            }
            //traverse bottom -> top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.println(arr[i][left]);
                }
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        Spiral_Order(arr);
    }
}
